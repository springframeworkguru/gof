package guru.springframework.gof.iterator;

public class DesignPattern {
    private String patternType;
    private String patternName;
    public DesignPattern(String patternType, String patternName){
        this.patternType=patternType;
        this.patternName=patternName;
    }

    public String getPatternType() {

        return patternType;
    }

      public String getPatternName() {
          return patternName;
    }




}
