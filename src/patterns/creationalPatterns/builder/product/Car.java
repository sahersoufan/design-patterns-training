package patterns.creationalPatterns.builder.product;

public class Car {

    private boolean wheels;
    private boolean breaks;
    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public boolean isBreaks() {
        return breaks;
    }

    public void setBreaks(boolean breaks) {
        this.breaks = breaks;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", breaks=" + breaks +
                '}';
    }
}
