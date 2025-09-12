package Level1;
public class Circle {
    private double radius;
    public Circle() {
        this(1.0); 
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.printf("Area  : %.2f\n", getArea());
    }
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayInfo();

        System.out.println();
        Circle customCircle = new Circle(5.5);
        System.out.println("Custom Circle:");
        customCircle.displayInfo();
    }
}
