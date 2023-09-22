package patterns.structuralPatterns.adapter.v2;

public class RoundHolev2 {
    private double radius;

    public RoundHolev2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fit(double radius){
        return this.getRadius() >= radius;
    }
}
