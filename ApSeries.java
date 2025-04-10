import java.util.Scanner;
//Find Sum of AP Series
public class ApSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Starting num: ");
        int s=sc.nextInt();

        System.out.print("Enter a difference betweentwo numbers: ");
        int d=sc.nextInt();

        System.out.print("Enter nth term : ");
        int n=sc.nextInt();

        int sum=0;

        for(int i=0;i<n;i++){
            sum+=s;
            
            s+=d;
        }
        System.out.println(sum);
        sc.close();
    }
}
