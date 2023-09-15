import java.util.Scanner;

public class Zad115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the retail price: ");
        double retail = input.nextDouble();

        double profit = retail*0.4;
        System.out.println("The profit from the trade was " + profit +" $");
    }
}
