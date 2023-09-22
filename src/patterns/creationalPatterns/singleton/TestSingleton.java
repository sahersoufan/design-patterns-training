package patterns.creationalPatterns.singleton;

public class TestSingleton {

    public static void test(){
        DataBase dataBase = DataBase.createInstance();
        System.out.println(dataBase.text("asd "));

        DataBase d2 = DataBase.createInstance();
        System.out.println(d2.text("zxc "));


    }

}
