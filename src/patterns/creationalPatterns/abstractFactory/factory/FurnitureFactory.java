package patterns.creationalPatterns.abstractFactory.factory;

import patterns.creationalPatterns.abstractFactory.chair.Chair;
import patterns.creationalPatterns.abstractFactory.table.Table;

public interface FurnitureFactory {

    public Chair createChair();
    public Table createTable();
}
