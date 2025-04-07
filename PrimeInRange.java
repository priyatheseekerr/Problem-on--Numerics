import java.util.Scanner;
//Prime numbers in a given range
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a range to find prime number: ");
        int range = sc.nextInt();
        isprime(range);
        sc.close();
    }

    static void isprime(int range) {

        if (range <= 1) {
            System.out.println("There is no prime in the given range");
            return;
        }
        for (int i = 2; i < range; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }
}
