package patterns.structuralPatterns.flyweight;

public class TreeType {
    double color;
    String texture;

    public TreeType(double color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public double getColor() {
        return color;
    }

    public void setColor(double color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void draw(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TreeType{" +
                "color=" + color +
                ", texture='" + texture + '\'' +
                '}';
    }
}
