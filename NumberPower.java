import java.util.Scanner;
//Power of a number
public class NumberPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int base = sc.nextInt();

        System.out.print("Enter a exponent number: ");
        int exp = sc.nextInt();

        double ans = Math.pow(base, exp);
        System.out.println((int) ans);
    }
}
