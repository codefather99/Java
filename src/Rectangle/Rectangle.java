package Rectangle;

public class Rectangle {
    public int height;
    public int width;
    public Point origin;

    // Constructors
    private Rectangle()
    {

    }

    public Rectangle(int a, int b, Point c)
    {
        height = a;
        width = b;
        origin = c;
    }

    // Methods
    public int getArea(int height, int width)
    {
        return height * width;
    }

}
