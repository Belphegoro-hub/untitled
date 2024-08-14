import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Метры");
        int metr = scanner.nextInt();
        System.out.println("Выбери действие");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        int option = scanner.nextInt();
        double mil = metr * 0.000621371;
        double d = metr * 39;
        double y = metr * 1.093;

        if(option == 1){
            System.out.println(mil);
        }else if(option == 2){
            System.out.println(d);
        }else if (option == 3){
            System.out.println(y);
        }else {
            System.out.println("Ошибка");
        }



    }
}
