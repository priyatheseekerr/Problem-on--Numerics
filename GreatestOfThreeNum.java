//	Greatest of three numbers

import java.util.Scanner;

public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println(max);
        sc.close();
    }
}
