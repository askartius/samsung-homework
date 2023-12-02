import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int quotient = 0;

        while(A >= 2) {
            A /= 2;
            quotient++;
        }

        System.out.println(quotient + 1);
    }
}