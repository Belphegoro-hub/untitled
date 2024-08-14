import javax.xml.transform.Source;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Время?");
        int sum1 = scanner.nextInt();

        if (sum1 >= 0 && sum1 < 6) {
            System.out.print("God Hight");
        }else if (sum1 >= 6 && sum1 < 13) {
            System.out.print("God Morning");
        }else if (sum1 >= 13 && sum1 < 17) {
            System.out.print("God Day");
        }else if (sum1 >= 17 && sum1 < 0) {
            System.out.print("God evening");
        }
    }
}
