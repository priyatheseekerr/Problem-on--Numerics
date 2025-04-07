import java.util.Scanner;
//Check if a number is armstrong number of not
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num = sc.nextInt();
        isArmstrong(num);
        sc.close();
    }

    static void isArmstrong(int num) {
        String n = String.valueOf(num);
        int len = n.length();
        int sum = 0;
        while (num > 0) {
            int rev = num % 10;
            num /= 10;
            sum += Math.pow(rev, len);
        }
        if (sum == Integer.parseInt(n)) {
            System.out.println("It is armstrong Number");
        } else {
            System.out.println("It is  not an armstrong Number");
        }
    }
}
