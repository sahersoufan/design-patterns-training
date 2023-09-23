package patterns.behavioralPatterns.chainOfResponsipilty;

public class Panel extends Container{
    private String modelHelp = "I can help you !!";

    public void showHelp(){
        if (modelHelp != null){
            System.out.println(modelHelp);
            return;
        }
        super.showHelp();
    }
}
