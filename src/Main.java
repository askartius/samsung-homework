import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = 0;

        if (a < 0) {
            a = -a;
            b = -b;
        }

        while (a > 0) {
            res += b;
            a -= 1;
        }

        System.out.println(res);
    }
}