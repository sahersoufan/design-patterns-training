package patterns.structuralPatterns.flyweight;

import java.util.ArrayList;
import java.util.Objects;

public class TreeFactory {

    static ArrayList<TreeType> treeTypes = new ArrayList<>();

    static public TreeType getTreeType(double color, String texture){

        TreeType treeType = treeTypes.stream()
//                .filter(Objects::nonNull)
                .filter(tree -> tree.getColor() == color & tree.getTexture().equals(texture))
                .findFirst()
                .orElse(new TreeType(color, texture));

        if (!treeTypes.contains(treeType)){
            treeTypes.add(treeType);
            return treeType;
        }
        return treeType;
    }

    static public void check(){
        treeTypes.forEach(System.out::println);
    }
}
