package patterns.structuralPatterns.adapter.v2;

public class SquareFittingAdapter implements FitTheHole{

    SquarePegv2 squarePeg;

    public SquareFittingAdapter(SquarePegv2 squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2.0)/2.0;    }
}
