import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        while (N > 0) {
            if (N % 10 % 2 == 1) {
                System.out.println(N % 10);
                break;
            } else {
                N /= 10;
            }
        }
        if (N == 0) {
            System.out.println("NO");
        }
    }
}