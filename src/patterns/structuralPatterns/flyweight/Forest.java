package patterns.structuralPatterns.flyweight;

import java.util.ArrayList;

public class Forest {

    private ArrayList<Tree> trees = new ArrayList<>();

    public Forest(ArrayList<Tree> trees) {
        this.trees = trees;
    }

    public Forest() {

    }

    public void plantTree(int x, int y, double color, String texture){
        Tree tree = new Tree(x, y, TreeFactory.getTreeType(color, texture));
        trees.add(tree);
    }

    public void draw(){
        trees.forEach(System.out::println);
        TreeFactory.check();
    }
}
