import java.util.Scanner;
//	Sum of first N natural numbers
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int sum=0;

        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();

    }
}
