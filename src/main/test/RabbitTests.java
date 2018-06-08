import java.util.Date;

import com.ljx.demo.service.Sender;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class RabbitTests {

    @Autowired
    private Sender sender;

    @Test
    public void sendTest() throws Exception {
        while (true) {
            String msg = new Date().toString();
            sender.send(msg);
            Thread.sleep(1000);
        }
    }
}
