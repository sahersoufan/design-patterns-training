package patterns.structuralPatterns.composite;

public class TestComposite {

    public static void test(){
        CompoundGraphic compoundGraphic = new CompoundGraphic();

        compoundGraphic.add(new Circle(1, 1, 5));
        compoundGraphic.add(new Dot(2, 3));

        CompoundGraphic group = new CompoundGraphic();
        compoundGraphic.add(new Circle(2, 4, 5));
        compoundGraphic.add(new Dot(5, 8));

        compoundGraphic.add(group);

        compoundGraphic.draw();
    }
}
