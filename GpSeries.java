import java.util.Scanner;
//Program to find sum of GP Series
public class GpSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Starting num: ");
        double s = sc.nextDouble();

        System.out.print("Enter a common ratio : ");
        double r = sc.nextDouble();

        System.out.print("Enter nth term : ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += s;
            s *= r;
        }
        System.out.println(sum);
        sc.close();
    }
}
