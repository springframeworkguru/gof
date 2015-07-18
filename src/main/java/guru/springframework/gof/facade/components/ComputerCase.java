package guru.springframework.gof.facade.components;


public class ComputerCase {
    MotherBoard motherBoard;
    public void addMotherBoard(MotherBoard motherBoard){
        this.motherBoard=motherBoard;
        System.out.println("Motherboard attached to computer case..");
    }
    public void attachPowerCables(){
        System.out.println("Power cable attached..");
    }
    public void pack(){
        System.out.println("Computer packaged..");
    }
}
