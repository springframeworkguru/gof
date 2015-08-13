package guru.springframework.gof.proxy;

public interface ReportGenerator {
    void generateComplexReport(String reportFormat,int reportEntries);
    void generateSensitiveReport();
}
