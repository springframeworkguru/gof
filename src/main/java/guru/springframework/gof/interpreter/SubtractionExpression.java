package guru.springframework.gof.interpreter;


public class SubtractionExpression implements Expression{
    private Expression firstExpression,secondExpression;
    public SubtractionExpression(Expression firstExpression, Expression secondExpression){
        this.firstExpression=firstExpression;
        this.secondExpression=secondExpression;
    }
    @Override
    public int interpret(){
        return this.firstExpression.interpret()-this.secondExpression.interpret();
    }
    @Override
    public String toString(){
        return "-";
    }
}
