import java.util.Scanner;
//Permutations in which N people can occupy R seats in a classroom
public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        System.out.print("Enter number of seats: ");
        int seat = sc.nextInt();

        if (seat > people) {
            System.out.println("Invalid Input: seat cannot high than people");
        } else {
            int numeric = fact(people);

            int denominator = fact(people - seat);
            System.out.println(numeric / denominator);
        }
    }

    public static int fact(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

}
