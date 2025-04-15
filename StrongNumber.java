import java.util.Scanner;

//Check if a number is a strong number or not
public class StrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        fact(num);
    }

    static void fact(int num) {
        String n = String.valueOf(num);
        int tot = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            int sum = 1;
            for (int j = 1; j <= digit; j++) {
                sum *= j;
            }
            tot += sum;
        }
        if (tot == num) {
            System.out.println("It is Strong number");
        } else {
            System.out.println("It is  not a Strong number");
        }
    }
}