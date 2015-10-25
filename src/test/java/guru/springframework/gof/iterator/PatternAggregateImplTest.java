package guru.springframework.gof.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternAggregateImplTest {

    @Test
    public void testPatternIterator() throws Exception {
        DesignPattern pattern1 = new DesignPattern("Creational", "Factory Method");
        DesignPattern pattern2 = new DesignPattern("Creational", "Abstract Factory");
        DesignPattern pattern3 = new DesignPattern("Structural", "Adapter");
        DesignPattern pattern4 = new DesignPattern("Structural", "Bridge");
        DesignPattern pattern5 = new DesignPattern("Behavioral", "Chain of Responsibility");
        DesignPattern pattern6 = new DesignPattern("Behavioral", "Iterator");

        PatternAggregate patternAggregate = new PatternAggregateImpl();
        patternAggregate.addPattern(pattern1);
        patternAggregate.addPattern(pattern2);
        patternAggregate.addPattern(pattern3);
        patternAggregate.addPattern(pattern4);
        patternAggregate.addPattern(pattern5);
        patternAggregate.addPattern(pattern6);

        System.out.println("-----Pattern list-----");
        printPatterns(patternAggregate);

        patternAggregate.removePattern(pattern1);
        patternAggregate.removePattern(pattern2);

        System.out.println("-----Pattern list after removal operation-----");
        printPatterns(patternAggregate);
    }
    public void printPatterns(PatternAggregate patternAggregate){
        PatternIterator patternIterator= patternAggregate.getPatternIterator();
        while(!patternIterator.isLastPattern()){
            DesignPattern designPattern=patternIterator.nextPattern();
            System.out.println(designPattern.getPatternType() + " : " + designPattern.getPatternName());

        }


    }
}