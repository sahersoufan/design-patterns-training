package patterns.structuralPatterns.adapter.v1;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    public SquarePegAdapter(double radius, SquarePeg squarePeg) {
        super(radius);
        this.squarePeg = squarePeg;
    }

    public double getRadius(){
        return squarePeg.getWidth() * Math.sqrt(2.0)/2.0;
    }
}
