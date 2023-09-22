package patterns.creationalPatterns.abstractFactory.factory;

import patterns.creationalPatterns.abstractFactory.chair.Chair;
import patterns.creationalPatterns.abstractFactory.chair.OldChair;
import patterns.creationalPatterns.abstractFactory.table.OldTable;
import patterns.creationalPatterns.abstractFactory.table.Table;

public class OldFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Table createTable() {
        return new OldTable();
    }
}
