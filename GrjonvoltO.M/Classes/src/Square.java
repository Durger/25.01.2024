public class Square implements Shape{
    int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int getPerimeter() {
        return 4 * width;
    }

    @Override
    public int getArea() {
        return width * width;
    }
}
