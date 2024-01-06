import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

        int num = scanner.nextInt() + 1;
        boolean isPrime = false;

        while (!isPrime) {
            for (int primeNumber : primeNumbers) {
                if (num % primeNumber != 0) {
                    isPrime = true;
                } else {
                    if (num == primeNumber) {
                        isPrime = true;
                    } else {
                        isPrime = false;
                        num += 1;
                    }
                    break;
                }
            }
        }

        System.out.println(num);
    }
}