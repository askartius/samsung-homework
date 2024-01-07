import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int oddSum = 0;
        int oddCount = 0;

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num % 2 != 0) {
                oddSum += num;
                oddCount++;
            }
        }

        if (oddCount == 0) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", (float) oddSum / oddCount);
        }
    }
}