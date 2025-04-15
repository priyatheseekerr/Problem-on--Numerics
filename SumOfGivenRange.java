import java.util.Scanner;
//Sum of numbers in the given range
public class SumOfGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter a ending range: ");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
