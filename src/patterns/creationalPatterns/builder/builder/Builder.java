package patterns.creationalPatterns.builder.builder;

public interface Builder {

    public void setWheels(boolean b);
    public void setBreaks(boolean b);

    public void reset();
}
