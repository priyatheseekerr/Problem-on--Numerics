import java.util.Scanner;
//	Print all prime factors of the given number
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The prime factors for " + num + " is: ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0 && isprime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isprime(int n) {
        if (n <= 1) return false;
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
               return false;
            }
        }
        return true;
    }
}
