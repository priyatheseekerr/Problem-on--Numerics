import java.util.Scanner;

//Check if a number is perfect number
public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num = sc.nextInt();
        isPerfect(num);
        sc.close();
    }

    static void isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not perfect number");
        }
    }
}
