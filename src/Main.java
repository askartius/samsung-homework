import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int x = 10000 / a + 1;
        boolean found = false;

        while (a * x + b < 100000) {
            if ((a * x + b) % c == d) {
                System.out.print(a * x + b + " ");
                found = true;
            }
            x++;
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}