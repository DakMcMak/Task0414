import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 365;
        Scanner scanner = Scanner(System.in);
        int year = scanner.nextInt();
        if ((year%4 ==0) && (year%400 == 0 || year%100 != 0))
        {
            x = 366;
        }
        System.out.println("количество дней в году: " + x);
    }
}
