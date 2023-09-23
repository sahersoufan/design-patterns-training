package patterns.behavioralPatterns.chainOfResponsipilty;

public class Dialog extends Container{
    private String pageUrl;


    @Override
    public void showHelp() {
        if (pageUrl != null){
            System.out.println(pageUrl);
            return;
        }
        super.showHelp();
    }
}
