package patterns.behavioralPatterns.chainOfResponsipilty;

public class CoRTest {

    public static void test(){
        Dialog dialog = new Dialog();
        Panel panel = new Panel();
        Button button = new Button();

        panel.add(button);
        dialog.add(panel);

        button.showHelp();
    }
}
