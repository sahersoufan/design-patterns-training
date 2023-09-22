package patterns.structuralPatterns.flyweight;

public class Tree {
    int x;
    int y;
    TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "x=" + x +
                ", y=" + y +
                ", treeType=" + treeType +
                '}';
    }
}
