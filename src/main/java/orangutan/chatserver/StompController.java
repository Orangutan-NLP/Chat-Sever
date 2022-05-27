package orangutan.chatserver;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;


@Controller
@RequiredArgsConstructor
public class StompController {
    private final SimpMessagingTemplate mess;
    @MessageMapping("/message")
    public void getMessage(@Payload Message message) throws Exception{
        mess.convertAndSend("/sub/message",message);
    }
}
