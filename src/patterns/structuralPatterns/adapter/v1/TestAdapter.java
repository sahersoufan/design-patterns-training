package patterns.structuralPatterns.adapter.v1;

public class TestAdapter {

    public static void test(){
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println(hole.fit(roundPeg));

        SquarePeg squarePeg = new SquarePeg(8);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(roundPeg.getRadius(), squarePeg);
        System.out.println(hole.fit(squarePegAdapter));

    }
}
