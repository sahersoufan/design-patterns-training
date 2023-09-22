package patterns.creationalPatterns.abstractFactory.factory;

public class TestAbstractFactory {

    public static void testAbstractFactory(){
        Client client = new Client(new OldFurnitureFactory());
        client.createFurniture();
    }
}
