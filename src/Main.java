import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int min = 9;

        while (N > 0) {
            if (N % 10 > 0 && N % 10 < min) {
                min = N % 10;
            }
            N /= 10;
        }

        System.out.println(min);
    }
}