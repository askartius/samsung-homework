import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double res = 1;

        if (n % 2 != 0) {
            res = a;
            n--;
        }

        a *= a;
        n /= 2;

        while(n > 0) {
            res *= a;
            n--;
        }

        System.out.println(res);
    }
}