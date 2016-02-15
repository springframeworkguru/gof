package guru.springframework.gof.visitor.visitors;


import guru.springframework.gof.visitor.structure.OperaMailClient;
import guru.springframework.gof.visitor.structure.SquirrelMailClient;
import guru.springframework.gof.visitor.structure.ZimbraMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);
    void visit(SquirrelMailClient mailClient);
    void visit(ZimbraMailClient mailClient);
}
