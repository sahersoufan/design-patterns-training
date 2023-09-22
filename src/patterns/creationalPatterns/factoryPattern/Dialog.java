package patterns.creationalPatterns.factoryPattern;

public abstract class Dialog {
    public abstract Button createButton();

    public void render(){
        Button button = createButton();
        button.title();
    }
}
