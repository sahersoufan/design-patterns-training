package patterns.creationalPatterns.factoryPattern;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
