import java.util.Scanner;
//Check if a number is Harshad number
public class HarshadNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isHarshad(num);
    }

    static void isHarshad(int num) {
        int n = num;
        int sum = 0;
        while (num > 0) {
            int rev = num % 10;
            num /= 10;
            sum += rev;
        }
        if (n % sum == 0) {
            System.out.println("It is harshad number");
        } else {
            System.out.println("It is not  harshad number");
        }

    }
}
