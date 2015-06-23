package guru.springframework.gof.bridge.abstraction;
import guru.springframework.gof.bridge.implementation.MessageSender;

public class EmailMessage extends Message{
    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
        messageSender.sendMessage();
    }

}
