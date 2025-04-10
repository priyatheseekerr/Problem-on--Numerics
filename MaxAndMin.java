import java.util.Arrays;
import java.util.Scanner;
//Maximum and Minimum digit in a number

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  a digit:");
        String digit = sc.nextLine();
        int[] arr = new int[digit.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = digit.charAt(i) - '0';
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Min: " + min + " " + "Max: " + max);
        sc.close();
    }
}
