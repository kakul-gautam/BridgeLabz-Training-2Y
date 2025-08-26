import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (cm): ");
        double height = scanner.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / 6.4516;
        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and sq cm is " + areaCm);
    }
}
