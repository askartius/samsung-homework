import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                System.out.println(i + 1);
                break;
            }
            if (i == numbers.length - 1) {
                System.out.println("NO");
            }
        }
    }
}