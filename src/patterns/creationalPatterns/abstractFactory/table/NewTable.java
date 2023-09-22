package patterns.creationalPatterns.abstractFactory.table;

public class NewTable implements Table{
    @Override
    public void whoIAm() {
        System.out.println("I am an New Table");
    }
}
