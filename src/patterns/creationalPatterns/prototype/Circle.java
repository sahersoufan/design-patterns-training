package patterns.creationalPatterns.prototype;

public class Circle extends Shape{

    public Circle() {
    }

    public Circle(int x, int y) {
        super(x, y);
    }

    public Circle(Circle circle) {
        super(circle.getX(), circle.getY());
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }


}
