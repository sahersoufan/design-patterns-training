package patterns.structuralPatterns.composite;

public class Circle extends Dot{

    private int radius;


    public Circle(int x, int y, int r) {
        super(x, y);
        radius = r;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
