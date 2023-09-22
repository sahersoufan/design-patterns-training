package patterns.creationalPatterns.factoryPattern;

public class WebButton implements Button{

    @Override
    public void title() {
        System.out.println("I am a Web Button!");
    }
}
