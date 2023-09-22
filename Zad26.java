import java.util.Scanner;

public class Zad26 {
    public static void main(String[] args) {
        System.out.println("Program zmieniający jednostki czasu");
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę sekund: ");
        int seconds = in.nextInt();
        int days = seconds / 86400;
        int leftOverSeconds = seconds % 86400;
        int minutes = seconds / 60;
        int leftOverminutes = (minutes / 86400) % 86400;
        int finalLeftover = leftOverSeconds % 60;




        System.out.println(seconds + " sekund to " + days + " dni, " + leftOverminutes + " minut, oraz " + finalLeftover + " sekund");


    }

}
