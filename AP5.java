import java.util.Scanner;

public class AP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is " + volume);
        scanner.close();
    }
}
