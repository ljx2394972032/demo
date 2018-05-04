package com.ljx.demo.controller;

import com.ljx.demo.response.ResponseEntity;
import com.ljx.demo.utils.wechatUtils.wechatShare.WxConfigUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("wechat")
@CrossOrigin
public class WechatShareController {

    private static final Logger log = LoggerFactory.getLogger(WechatShareController.class);

    @Value("${wechat.appid}")
    private String APPID;

    @Value("${wechat.secret}")
    private String SECRET;

    @RequestMapping("/share")
    public ResponseEntity share(HttpServletRequest request, String appUrl) {
        String urlTemp = "http://" + request.getServerName() + request.getContextPath();
        String urlpath = "http://" + request.getServerName();
        if (request.getParameter("code") != null) {
            appUrl += "&code=" + request.getParameter("code");
        }
        if (request.getParameter("state") != null) {
            appUrl += "&state=" + request.getParameter("state");
        }
        Map<String, Object> signature = WxConfigUtil.getSignature(appUrl, APPID, SECRET, urlTemp, urlpath);
        if (signature == null) {
            log.error("分享出错了：" + appUrl);
            return ResponseEntity.ERR(500, "分享出错了").build();
        }
        return ResponseEntity.SUCC().data(signature).build();
    }
}
