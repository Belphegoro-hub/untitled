import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int sum3 = scanner.nextInt();

        System.out.println("Максимум(1) Минимум(2) Среднее(3)");
        int result = scanner.nextInt();

        if (result == 1) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                System.out.println(sum1);
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                System.out.println(sum2);
            } else {
                System.out.println(sum3);
            }
        } else if (result == 2) {
            if (sum1 <= sum2 && sum1 <= sum3) {
                System.out.println(sum1);
            } else if (sum2 <= sum1 && sum2 <= sum3) {
                System.out.println(sum2);
            } else {
                System.out.println(sum3);
            }
        } else if (result == 3) {
            System.out.println((sum1 + sum2 + sum3) / 3.0);
        } else {
            System.out.println("Некорректный выбор");
        }
    }
}
