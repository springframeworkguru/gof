package guru.springframework.gof.ChainofResponsibility;

        import guru.springframework.gof.ChainofResponsibility.handlers.BillingSupportHandler;
        import guru.springframework.gof.ChainofResponsibility.handlers.AbstractSupportHandler;
        import guru.springframework.gof.ChainofResponsibility.handlers.GeneralSupportHandler;
        import guru.springframework.gof.ChainofResponsibility.handlers.TechnicalSupportHandler;

public class RequestorClient {

    public  static AbstractSupportHandler getHandlerChain(){


        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler( AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(  AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }

}
