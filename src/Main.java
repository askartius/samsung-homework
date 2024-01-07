import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int digit;
        boolean equal = false;

        while (num > 0) {
            digit = num % 10;
            num /= 10;

            if (num % 10 == digit) {
                equal = true;
            }
        }

        System.out.println(equal ? "YES" : "NO");
    }
}