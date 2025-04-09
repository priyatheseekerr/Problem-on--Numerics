import java.util.Scanner;
//Sum of digits of a number
public class SumOfDigit {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        String n=String.valueOf(num);
        int sum=0;

        for(int i=0;i<n.length();i++){
            int ch=n.charAt(i)-'0';
            sum+=ch;
        }
        System.out.println(sum);
        sc.close();
     }
}
