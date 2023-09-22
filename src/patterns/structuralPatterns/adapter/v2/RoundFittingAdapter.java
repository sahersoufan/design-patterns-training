package patterns.structuralPatterns.adapter.v2;

public class RoundFittingAdapter implements FitTheHole{

    RoundPegv2 roundPegv2;

    public RoundFittingAdapter(RoundPegv2 roundHolev2) {
        this.roundPegv2 = roundHolev2;
    }

    @Override
    public double getRadius() {
        return roundPegv2.getRadius();
    }
}
