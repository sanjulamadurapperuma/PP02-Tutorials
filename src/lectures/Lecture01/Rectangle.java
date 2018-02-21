package lectures.Lecture01;

public class Rectangle implements Comparable<Rectangle>{
    private double length;
    private double width;
    private static int count = 0;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
        count++;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public static int getCount() {
        return count;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public int compareTo(Rectangle o) {
        return (int) Math.round(this.getArea() - o.getArea());
    }
}
