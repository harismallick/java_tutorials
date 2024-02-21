import java.util.Scanner;

public class MathInJava {
    public static void main(String[] args) {
        // Built in math functions can be used for various operations.

        double x = 3.14;
        double y = -10;
        // Getting max of two nums:
        double max = Math.max(x, y);
        double min = Math.min(x, y);
        double sqrt = Math.sqrt(25);
        double absolute = Math.abs(y);
        double round = Math.round(x); // Rounds up to the nearest integer.
        double divide = 5.0/2; 

        System.out.println(max + "\n" + min + "\n" + sqrt + "\n" + absolute +  "\n" + round);
        System.out.println(Math.floor(divide));
        System.out.println(Math.ceil(divide));
        
        double base;
        double height;
        double hypotenuse;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the base: ");
        base = scanner.nextDouble();
        System.out.println("Enter length of the height: ");
        height = scanner.nextDouble();

        hypotenuse = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse of " + base + " and " + height + " is: " + hypotenuse);

        scanner.close();

    }
}
