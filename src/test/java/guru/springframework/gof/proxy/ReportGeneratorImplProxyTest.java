package guru.springframework.gof.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReportGeneratorImplProxyTest {

    @Test
    public void testGenerateReport() throws Exception {
        Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGeneratorImplProxy proxy=new ReportGeneratorImplProxy("Pdf",50, accessRole);
        proxy.displayReportTemplate();
        proxy.generateComplexReport("Pdf",50);
        proxy.generateSensitiveReport();
    }
}