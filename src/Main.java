import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int quotient = 0;

        while(N >= 10) {
            N /= 10;
            quotient++;
        }

        System.out.println(quotient + 1);
    }
}