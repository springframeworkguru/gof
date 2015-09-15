package guru.springframework.gof.ChainofResponsibility.handlers;

public abstract class AbstractSupportHandler {

    public static int TECHNICAL = 10;
    public static int BILLING = 20;
    public static int GENERAL = 30;

    protected int level;

    protected AbstractSupportHandler nextHandler;
    public void setNextHandler(AbstractSupportHandler nextHandler){
        this.nextHandler=nextHandler;
    }

    public void receiveRequest(int level, String message){
        if(this.level <= level){
            handleRequest(message);
        }
        if(nextHandler !=null){
            nextHandler.receiveRequest(level, message);
        }
    }

    abstract protected void handleRequest(String message);

}


