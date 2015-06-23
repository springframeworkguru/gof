package guru.springframework.gof.bridge.abstraction;

import guru.springframework.gof.bridge.implementation.MessageSender;

public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender){
        this.messageSender=messageSender;
    }
     abstract public void send();
}
