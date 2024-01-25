public class Rectangle implements Shape{
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int getPerimeter() {
        return 2*(height + width);
    }


    public int getArea() {
        return width * height;
    }
}
