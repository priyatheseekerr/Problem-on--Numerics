import java.util.Scanner;
//	Check if the number is abundant number or not
public class abundant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        isAbundant(n);

    }
    static void  isAbundant(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("It is abundant number");
        }
        else{
            System.out.println("It is not abundant number");
        }
    }
}
