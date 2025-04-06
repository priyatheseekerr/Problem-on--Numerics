import java.util.Scanner;
//	Find all Palindrome numbers in a given range
public class PalindromeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a range to find palindrome: ");
        int range=sc.nextInt();

        palindrome(range);
        sc.close();
    }
    static void palindrome(int range){

        if(range>=0 && range<=9){
            for (int i = 0; i <= range; i++) {
                System.out.print(i+" ");
            }
        }
        else{
            int i=0;

            while (i<=range) {
                StringBuilder num=new StringBuilder(String.valueOf(i));
                num.reverse();
                int ans=Integer.parseInt(num.toString());
                if(i==ans){
                    System.out.print(i+" ");
                }
                i++;
            }
        }

    }
}
