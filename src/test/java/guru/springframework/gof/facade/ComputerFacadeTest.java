package guru.springframework.gof.facade;

import org.junit.Test;

import static org.junit.Assert.*;


public class ComputerFacadeTest {

    @Test
    public void testAssembleComputer() throws Exception {
     ComputerFacade facade=new ComputerFacade();
      facade.assembleComputer();
    }
}