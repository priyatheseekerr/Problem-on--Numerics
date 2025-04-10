import java.util.Scanner;
//Print Fibonacci upto Nth Term
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        if (num <= 0) {
            System.out.println("Enter a positive number.");
        } else if (num == 1) {
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 2; i < num; i++) {
                int sum = a + b;
                System.out.println(sum);
                a = b;
                b = sum;
            }
        }

        sc.close();
    }
}
