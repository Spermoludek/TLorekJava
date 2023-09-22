import java.util.Scanner;

public class Zad22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca: ");
        int month = input.nextInt();

        System.out.println("Podaj numer dnia: ");
        int day = input.nextInt();

        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int year = input.nextInt();

        if (day * month == year) {
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }

    }

}
