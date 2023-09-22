package patterns.creationalPatterns.prototype;

public class Rectangle extends Shape{

    public Rectangle() {
    }

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle.getX(), rectangle.getY());
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
