package patterns.structuralPatterns.decorator;

public class DataSourceDecorator implements DataSource{

    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String read() {
        return dataSource.read();
    }
}
