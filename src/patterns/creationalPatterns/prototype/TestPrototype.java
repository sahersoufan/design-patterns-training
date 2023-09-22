package patterns.creationalPatterns.prototype;

public class TestPrototype {
    // you can build much bigger one;
    public static void test(){
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);
        Rectangle r2 = (Rectangle) rectangle.clone();
        System.out.println(r2);
    }
}
