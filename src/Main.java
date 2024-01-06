import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 2;

        while (n > 0) {
            System.out.print(num + " ");
            num += 2;
            n--;
        }
    }
}