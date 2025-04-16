import java.util.Scanner;
//LCM of two numbers
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number to find Lcm: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int a1 = a;
        int b1 = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int result = (a1 * b1) / a;
        System.out.println(result);
    }
}
