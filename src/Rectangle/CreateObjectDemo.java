package Rectangle;

public class CreateObjectDemo {

    static void main() {
        Point originOne;   // Point declaration

        // Instantiating the Point class with the keyword new
        // i. creating a new object "originone" from the class Point
        originOne = new Point(33, 78);

        // Creating a new object from the Rectangle class
        Rectangle rectOne = new Rectangle(20, 10, originOne);

        Rectangle rectTwo = new Rectangle(4, 5, originOne);

        System.out.println("The area of rectangle 1 is : " + rectOne.getArea(rectOne.height, rectOne.width));

        System.out.println("The X point of rectangle 1 is : " + rectOne.origin.pointX);
    }
}


