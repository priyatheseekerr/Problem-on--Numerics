import java.util.Scanner;
//Program to find roots of a Quadratic Equation
public class RootsOfQuadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient of c: ");
        double c = sc.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            System.out.println("Roots are real and distinct");
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            System.out.println("Roots are real and equal");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are complex");
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1: " + real + " + " + imaginary + "i");
            System.out.println("Root 2: " + real + " - " + imaginary + "i");
        }
    }
}
