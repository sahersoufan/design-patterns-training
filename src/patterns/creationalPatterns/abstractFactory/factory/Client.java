package patterns.creationalPatterns.abstractFactory.factory;

import patterns.creationalPatterns.abstractFactory.chair.Chair;
import patterns.creationalPatterns.abstractFactory.table.Table;

public class Client {
    FurnitureFactory furnitureFactory;
    Chair chair;
    Table table;
    Client(FurnitureFactory factory){
        furnitureFactory = factory;
    }

    public void createFurniture(){
        chair = furnitureFactory.createChair();
        chair.whoIAm();
        table = furnitureFactory.createTable();
        table.whoIAm();
    }
}
