package patterns.structuralPatterns.facade;

public class Facade {
    public String convert(String s){
        //do things with C1
        C1 c1;
        //do things with C2
        C1 c2;
        //do things with C3
        C1 c3;
        //then do whatever you want
        return s + " Converted";

    }
}
