package guru.springframework.gof.bridge.abstraction;

import guru.springframework.gof.bridge.implementation.EmailMessageSender;
import guru.springframework.gof.bridge.implementation.MessageSender;
import guru.springframework.gof.bridge.implementation.TextMessageSender;
import org.junit.Test;

import static org.junit.Assert.*;


public class MessageTest {

    @Test
    public void testSend() throws Exception {
      MessageSender textMessageSender=new TextMessageSender();
      Message textMessage=new TextMessage(textMessageSender);
      textMessage.send();

       MessageSender emailMessageSender=new EmailMessageSender();
       Message emailMessage=new TextMessage(emailMessageSender);
       emailMessage.send();
    }
}