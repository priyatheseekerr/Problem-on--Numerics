import java.util.Scanner;
//	Prime numbers in a given range
public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a num: ");
        int num=sc.nextInt();
        boolean flag=true;

        if(num<=1){
           flag=false;
        }
        else{
            
           for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
            }
           }
        }
        if(flag){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
        sc.close();

    }
}
