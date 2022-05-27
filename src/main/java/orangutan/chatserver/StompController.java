package orangutan.chatserver;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class StompController {

    @MessageMapping("/message")
    @SendTo("/sub/message")
    public Message getMessage(@Payload Message message) throws Exception{
        return message;
    }
}
