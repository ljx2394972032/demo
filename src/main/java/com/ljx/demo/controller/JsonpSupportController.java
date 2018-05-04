package com.ljx.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * @参数： param
 * @功能描述：不能删除！
 * @作者信息： lujinxin
 * @创建时间： 2017-6-26下午2:31:50
 * @修改备注：
 */
@ControllerAdvice
public class JsonpSupportController extends AbstractJsonpResponseBodyAdvice {
	public JsonpSupportController() {
		super("callback", "jsonp");
	}
}
