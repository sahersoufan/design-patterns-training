package patterns.structuralPatterns.adapter.v1;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fit(RoundPeg roundPeg){
        return this.getRadius() >= roundPeg.getRadius();
    }
}
