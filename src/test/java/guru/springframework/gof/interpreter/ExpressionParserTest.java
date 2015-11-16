package guru.springframework.gof.interpreter;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExpressionParserTest {

    @Test
    public void testParse() throws Exception {
      String input="2 1 5 + *";
       ExpressionParser expressionParser=new ExpressionParser();
       int result=expressionParser.parse(input);
       System.out.println("Final result: "+result);

    }
}