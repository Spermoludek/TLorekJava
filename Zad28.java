import java.util.Scanner;

public class Zad28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę sztuk oprogramowania: ");
        int quantity = in.nextInt();
        int RETAIL = 99;
        double price = 99;
        if (quantity >= 10 && quantity < 20) {
            price = (RETAIL*0.2)*quantity;
        }
        if (quantity >= 20 && quantity < 50) {
            price = (RETAIL*0.3)*quantity;
        }
        if (quantity >= 50 && quantity < 100) {
            price = (RETAIL*0.4)*quantity;
        }
        if (quantity >= 100) {
            price = (RETAIL*0.5)*quantity;
        }
        System.out.println("Cena do zapłacenia z rabatem wynosi " + price);

    }

}
