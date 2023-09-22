package patterns.structuralPatterns.decorator;

public class FileDataSource implements DataSource{

    private String filename = "I am a file!";

    @Override
    public String read() {
        return filename;
    }
}
