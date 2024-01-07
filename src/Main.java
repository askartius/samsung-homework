import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int sum = 0;
        boolean noEven = true;

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
                noEven = false;
            }
        }

        System.out.println(noEven ? "NO" : sum);
    }
}