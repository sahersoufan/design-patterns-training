package patterns.creationalPatterns.abstractFactory.chair;

public class OldChair implements Chair{
    @Override
    public void whoIAm() {
        System.out.println("I am an Old Chair");
    }
}
