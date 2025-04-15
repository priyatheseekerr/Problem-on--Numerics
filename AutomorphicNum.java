import java.util.Scanner;
//Check if a Number is Automorphic
public class AutomorphicNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextInt();
        check(num);
    }

    static void check(long num) {
        long square = num * num;
        if (String.valueOf(square).endsWith(String.valueOf(num))) {
            System.out.println("It is automorphic number");
        } else {
            System.out.println("It is not an  automorphic number");
        }
    }
}
