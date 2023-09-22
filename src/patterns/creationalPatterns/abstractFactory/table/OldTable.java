package patterns.creationalPatterns.abstractFactory.table;

public class OldTable implements Table{
    @Override
    public void whoIAm() {
        System.out.println("I am an Old Table");
    }
}
