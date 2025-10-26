import java.util.Scanner;

public class OddSeriesConditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        int limit;
        // If input is even, use previous odd number
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        System.out.print("Output: ");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
            if (i < (2 * ((limit + 1) / 2) - 1)) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}