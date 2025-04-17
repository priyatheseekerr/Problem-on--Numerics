import java.util.Scanner;
//Program to add two fractions
public class SumOfFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numerator of first num: ");
        int n1 = sc.nextInt();

        System.out.print("Enter denominator of first num: ");
        int d1 = sc.nextInt();

        System.out.print("Enter a numerator of second num: ");
        int n2 = sc.nextInt();

        System.out.print("Enter denominator of second num: ");
        int d2 = sc.nextInt();

        int Lcm = lcm(d1, d2);

        int a = n1 * (Lcm / d1);
        int b = n2 * (Lcm / d2);

        int Gcd = gcd((a + b), Lcm);

        System.out.println((a + b) / Gcd + "/" + Lcm / Gcd);

    }

    public static int lcm(int n, int p) {
        int n1 = n;
        int p1 = p;
        while (p != 0) {
            int temp = p;
            p = n % p;
            n = temp;
        }
        return (n1 * p1) / n;
    }

    public static int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}
