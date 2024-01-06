import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = 1;

        while (n <= k) {
            if (scanner.nextInt() <= 437) {
                System.out.println("Crash " + n);
                break;
            }
            n += 1;
        }

        if (n > k) {
            System.out.println("No crash");
        }
    }
}