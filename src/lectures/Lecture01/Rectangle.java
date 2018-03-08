package lectures.Lecture01;

import java.util.Objects;

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
    public String toString() {
        return "Rectangle = [width = " + width + ", length = " + length + "]";
    }

    @Override
    public int compareTo(Rectangle o) {
        return (int) Math.round(this.getArea() - o.getArea());
    }

    ///add equals method

    //

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(length, width);
    }
}
