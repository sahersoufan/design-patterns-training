package patterns.structuralPatterns.decorator;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String read() {
        return super.read() + " Compression";
    }
}
