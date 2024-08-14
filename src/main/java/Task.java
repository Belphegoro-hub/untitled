import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int  x = scanner.nextInt();
        System.out.print("Введите 1 число ");
        int  a = scanner.nextInt();
        System.out.print("Введите 2 число ");
        int  n = scanner.nextInt();
        System.out.print("Введите 3 число ");


        System.out.print("Выбери действие ");
        System.out.print(" 1 Найти сумму чисел ");
        System.out.print(" 2 Найти произведение ");
        int option = scanner.nextInt();
        int result;

        if( option == 1){
            result = a + x + n;
            System.out.print("Сумма чисел; " + result);
        }else if (option == 2){
            result = a * x * n;
            System.out.print("произведение; " + result);

        }else{
            System.out.print("Ошибка");
        }


    }
}
