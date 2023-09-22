package patterns.creationalPatterns.factoryPattern;

public class TestFactory {

    public void tryIt(){
        Dialog dialog;
        String os = "Windows";

        if(os.equals("Web")){
            dialog = new WebDialog();
            dialog.render();
        } else if (os.equals("Windows")) {
            dialog = new WindowsDialog();
            dialog.render();

        }
    }
}
