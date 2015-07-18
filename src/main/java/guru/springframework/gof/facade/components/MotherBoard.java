package guru.springframework.gof.facade.components;


public class MotherBoard {
    HardDisk hardDisk;
    Cpu cpu;
    Ram ram;
    public void addHardDisk(HardDisk hardDisk){
        this.hardDisk=hardDisk;
        System.out.println("Hard disk added to motherboard..");
    }
    public void addCpu(Cpu cpu){

        System.out.println("CPU added to motherboard..");
    }
    public void addRam(Ram ram){
        this.ram=ram;
        System.out.println("RAM added to motherboard..");
    }
}
