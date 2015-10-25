package guru.springframework.gof.iterator;


import java.util.List;

public class PatternIteratorImpl implements PatternIterator{
    public List patternList;
    int position;
    DesignPattern designPattern;
    public PatternIteratorImpl(List patternList){
        this.patternList=patternList;
    }
    @Override
    public DesignPattern nextPattern(){
        System.out.println("Returning pattern at Position: "+position);
            designPattern=(DesignPattern)patternList.get(position);
            position++;
            return designPattern;
    }
@Override
    public boolean isLastPattern(){
    if(position< patternList.size()){
        return false;
    }
return true;
}


}