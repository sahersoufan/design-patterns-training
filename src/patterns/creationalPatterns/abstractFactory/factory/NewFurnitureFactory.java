package patterns.creationalPatterns.abstractFactory.factory;

import patterns.creationalPatterns.abstractFactory.chair.Chair;
import patterns.creationalPatterns.abstractFactory.chair.NewChair;
import patterns.creationalPatterns.abstractFactory.table.NewTable;
import patterns.creationalPatterns.abstractFactory.table.Table;

public class NewFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new NewChair();
    }

    @Override
    public Table createTable() {
        return new NewTable();
    }
}
