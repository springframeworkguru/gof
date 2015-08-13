package guru.springframework.gof.proxy;


public class ReportGeneratorImplProxy implements ReportGenerator{
    ReportGenerator reportGeneratorImpl;
    private String reportFormat;
    private int reportEntries;
    private Role accessRole;
    public ReportGeneratorImplProxy(String reportFormat, int reportEntries, Role accessRole){
        this.reportFormat=reportFormat;
        this.reportEntries=reportEntries;
        this.accessRole=accessRole;
    }

    public void displayReportTemplate() {
        System.out.println("ReportGeneratorImplProxy: Displaying Report template in " + this.reportFormat + " format with " + this.reportEntries + " entries");
    }

    @Override
    public void  generateComplexReport(String reportFormat,int reportEntries){
        if(reportGeneratorImpl==null)
            reportGeneratorImpl = new ReportGeneratorImpl();
            reportGeneratorImpl.generateComplexReport(reportFormat,reportEntries);
    }
    @Override
    public void generateSensitiveReport(){
        if(accessRole.getRole().equals("Manager")){
            if(reportGeneratorImpl==null)
                reportGeneratorImpl = new ReportGeneratorImpl();
                reportGeneratorImpl.generateSensitiveReport();
        }
        else{
            System.out.println("You are not authorized to access sensitive reports.");
        }

    }

}
