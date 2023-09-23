package patterns.behavioralPatterns.chainOfResponsipilty;


abstract public class Component implements ComponentWithContextHelp{
    private String tooltipText;

    protected Container container;

    public void showHelp(){
        if (tooltipText != null){
            System.out.println(tooltipText);
        }else if (container != null) {
            container.showHelp();
        }else {
            System.out.println("Sorry we Can not Help you :(");
        }
    }

}
