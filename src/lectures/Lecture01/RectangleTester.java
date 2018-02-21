package lectures.Lecture01;

public class RectangleTester {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5, 10);
        double area = r1.getArea();
        double perimeter = r1.getPerimeter();
        System.out.println("The count is : " + Rectangle.getCount());
        System.out.println("The length is : " + r1.getLength());
        System.out.println("The width is : " + r1.getWidth());
        System.out.println("Area is : " + area);
        System.out.println("Perimeter is : " + perimeter);
        System.out.println("The count is : " + Rectangle.getCount());//static method can be called before the application runs.static method does not depend on the object or class
    }
}
