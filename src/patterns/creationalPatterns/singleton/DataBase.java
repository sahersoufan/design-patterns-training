package patterns.creationalPatterns.singleton;

public class DataBase {
    private static DataBase dataBase;
    private DataBase() {
    }
    public String text(String t){
        return t + "bla bla";
    }

    public static DataBase createInstance(){
        if(dataBase == null){
            return new DataBase();
        }
        return dataBase;
    }
}
