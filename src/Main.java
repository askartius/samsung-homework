import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int divisor = 3;
        boolean isPrime = true;

        if (num % 2 == 0 && num != 2) {
            isPrime = false;
        } else {
            while (divisor < num) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor += 2;
            }
        }

        System.out.println(isPrime ? "prime" : "composite");
    }
}