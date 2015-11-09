package guru.springframework.gof.memento;

import org.junit.Test;

import static org.junit.Assert.*;


public class EmpOriginatorTest {

    @Test
    public void testMemento() throws Exception {
        EmpOriginator empOriginator= new EmpOriginator(306,"Mark Ferguson", "131011789610","Sales Manager");

        EmpMemento empMemento=empOriginator.saveToMemento();
        EmpCaretaker empCaretaker=new EmpCaretaker();
        empCaretaker.addMemento(empMemento);
        System.out.println("\n Original EmpOriginator");
        empOriginator.printInfo();


        System.out.println("\n EmpOriginator after updating phone number");
        empOriginator.setEmpPhoneNo("131011888886");
        empMemento=empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        System.out.println("\n EmpOriginator after updating designation");
        empOriginator.setEmpDesignation("Senior Sales Manager");
        empMemento=empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
       empOriginator.printInfo();


        System.out.println("\n EmpOriginator after undoing designation update");
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();


        System.out.println("\n Original EmpOriginator after undoing phone number update");
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();


    }
}