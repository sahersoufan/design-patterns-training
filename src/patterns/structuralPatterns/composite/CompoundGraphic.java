package patterns.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements GraphicComponent{

    List<GraphicComponent> graphicComponents = new ArrayList<>();

    //add
    public void add(GraphicComponent graphicComponent){
        graphicComponents.add(graphicComponent);
    }

    // remove

    // move
    @Override
    public void move(int x, int y) {
    }

    //draw
    public void draw(){
        graphicComponents.forEach(System.out::println);
    }
}
