package patterns.structuralPatterns.decorator;

public class EncryptedDecoder extends DataSourceDecorator{

    public EncryptedDecoder(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String read() {
        return super.read() + " Encrypted";
    }
}
