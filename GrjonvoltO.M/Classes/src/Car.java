public class Car {
    private String model;
    private String color;
    private int maxSpeed;

    private String status;

    private static int counter = 0;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
        this.model = "Pagani";
        this.color = "Черная";
        this.maxSpeed = 400;
        counter++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return model + " " + color + " " + maxSpeed + "\n" + counter;
    }
}
