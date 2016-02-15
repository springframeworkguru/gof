package guru.springframework.gof.visitor.structure;

import guru.springframework.gof.visitor.visitors.MailClientVisitor;

public interface MailClient {
    void sendMail(String[] mailInfo);
    void receiveMail(String[] mailInfo);
    boolean accept(MailClientVisitor visitor);
}
