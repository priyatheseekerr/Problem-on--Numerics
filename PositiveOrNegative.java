import java.util.Scanner;
//Check weather a given number is positive or negative
public class PositiveOrNegative {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is positive");
        }
        sc.close();
     }
}
