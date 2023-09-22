package patterns.structuralPatterns.adapter.v2;

public class TestAdapterv2 {

    public static void test(){
        RoundHolev2 hole = new RoundHolev2(5);
        RoundPegv2 roundPeg = new RoundPegv2(5);

        System.out.println(hole.fit(roundPeg.getRadius()));

        SquarePegv2 squarePeg = new SquarePegv2(8);
        SquareFittingAdapter squarePegAdapter = new SquareFittingAdapter(squarePeg);
        System.out.println(hole.fit(squarePegAdapter.getRadius()));

    }
}
