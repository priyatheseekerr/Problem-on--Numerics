//Greatest of two numbers

import java.util.Scanner;

public class GreatestOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greatest");
        } else {
            System.out.println(num2 + " is greatest");
        }
        sc.close();
    }

}
