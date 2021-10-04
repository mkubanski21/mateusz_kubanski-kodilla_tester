import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok do sprawdzenia ");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println("Rok "+year+" nie jest przestępny.");
        } else if (year % 100 != 0) {
            System.out.println("Rok "+year+" jest przestępny.");
        } else if (year % 400 != 0) {
            System.out.println("Rok "+year+" nie jest przestępny.");
        } else {
            System.out.println("Rok "+year+" jest przestępny.");
        }
    }
}