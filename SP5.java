import java.util.Scanner;

public class SP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in Kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        scanner.close();
    }
}
