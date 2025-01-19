import java.util.Scanner;

public class SP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the Exponent: ");
        int exponent = scanner.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        scanner.close();
    }
}
