package patterns.structuralPatterns.bridge;

public class TestBridge {

    public static void test(){
        Radio radio = new Radio();

        Remote remote = new Remote(radio);
        System.out.println(remote.togglePower());
        System.out.println(remote.togglePower());

        Tv tv = new Tv();
        Remote remote1 = new Remote(tv);
        System.out.println(remote1.togglePower());
    }
}
