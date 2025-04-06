//Check if a number is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        StringBuilder result = new StringBuilder(String.valueOf(num));
        result.reverse();
        int nums = Integer.parseInt(result.toString());
        if (nums == num) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
        sc.close();
    }
}