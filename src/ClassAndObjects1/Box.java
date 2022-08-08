package ClassAndObjects1;

public class Box {
    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume () {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box box = new Box(5.0,5.0, 3.5);
        System.out.print("box volume: " + box.getVolume());
    }
}
