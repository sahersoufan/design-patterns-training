package patterns.structuralPatterns.facade;

public class TestFacade {

    public static void test(){
        Facade facade = new Facade();
        System.out.println(facade.convert("String"));
    }
}
