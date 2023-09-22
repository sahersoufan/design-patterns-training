package patterns.structuralPatterns.flyweight;

public class FlyweightTest {

    public static void test(){
        Forest forest = new Forest();
        forest.plantTree(1, 1, 3.5, "Green");
        forest.plantTree(2, 4, 3.5, "Green");
        forest.plantTree(3, 3, 3.0, "Orange");

        forest.draw();

    }
}
