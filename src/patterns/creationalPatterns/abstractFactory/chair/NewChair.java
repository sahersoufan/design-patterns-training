package patterns.creationalPatterns.abstractFactory.chair;

public class NewChair implements Chair{


    @Override
    public void whoIAm() {
        System.out.println("I am a New Chair");
    }
}
