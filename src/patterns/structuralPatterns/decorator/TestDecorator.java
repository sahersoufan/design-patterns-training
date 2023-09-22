package patterns.structuralPatterns.decorator;

public class TestDecorator {

    public static void test(){
        FileDataSource fileDataSource = new FileDataSource();

        System.out.println(fileDataSource.read());

        EncryptedDecoder encryptedDecoder = new EncryptedDecoder(fileDataSource);
        System.out.println(encryptedDecoder.read());
    }
}
