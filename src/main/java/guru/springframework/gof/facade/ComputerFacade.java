package guru.springframework.gof.facade;

import guru.springframework.gof.facade.components.*;

public class ComputerFacade {

    Cpu cpu;
    HardDisk hardDisk;
    Ram ram;
    MotherBoard motherBoard;
    ComputerCase computerCase;
    public ComputerFacade(){
        this.cpu=new Cpu(3);
        this.hardDisk=new HardDisk(750);
        this.ram=new Ram(8);
        this.motherBoard=new MotherBoard();
        this.computerCase=new ComputerCase();

    }
    public void assembleComputer(){
        motherBoard.addCpu(cpu);
        motherBoard.addHardDisk(hardDisk);
        motherBoard.addRam(ram);
        computerCase.addMotherBoard(motherBoard);
        computerCase.attachPowerCables();
        computerCase.pack();
    }
}
