package guru.springframework.gof.command.invoker;

import guru.springframework.gof.command.commandobjects.*;
import guru.springframework.gof.command.receiver.Car;
import guru.springframework.gof.command.receiver.RotatingTop;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoteControlTest {
    @Test
    public void testRemoteControlButtonPressed() throws Exception {
        RemoteControl remoteControl=new RemoteControl();
        System.out.println("-----Testing onButtonPressed on RemoteControl for Car-----");
        Car car=new Car();
        CommandBase carMoveCommand=new CarMoveCommand(car);
        remoteControl.onButtonPressed(carMoveCommand);
        System.out.println("-----Testing offButtonPressed on RemoteControl for Car-----");
        CommandBase carStopCommand=new CarStopCommand(car);
        remoteControl.offButtonPressed(carStopCommand);
        System.out.println("-----Testing undoButtonPressed() on RemoteControl for Car-----");
        remoteControl.undoButtonPressed();

        System.out.println("-----Testing onButtonPressed on RemoteControl for RotatingTop-----");
        RotatingTop top=new RotatingTop();
        CommandBase topRotateCommand=new TopRotateCommand(top);
        remoteControl.onButtonPressed(topRotateCommand);

        System.out.println("-----Testing offButtonPressed on RemoteControl for RotatingTop-----");
        CommandBase topStopRotateCommand=new TopStopRotateCommand(top);
        remoteControl.offButtonPressed(topStopRotateCommand);

       System.out.println("-----Testing undoButtonPressed on RemoteControl for RotatingTop-----");

        remoteControl.undoButtonPressed();


    }


}