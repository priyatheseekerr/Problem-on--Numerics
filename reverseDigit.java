//Reverse digits of a number

import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        StringBuilder n=new StringBuilder(String.valueOf(num));

        System.out.println(n.reverse());

       sc.close();
    }
}
