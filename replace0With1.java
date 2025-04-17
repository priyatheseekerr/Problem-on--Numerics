import java.util.Scanner;
//Replace all 0s with 1s in a given integer
public class replace0With1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num = sc.nextLine();

        StringBuilder n = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                n.setCharAt(i, '1');
            }
        }
        System.out.println(n);
    }
}
