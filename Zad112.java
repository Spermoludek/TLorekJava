import java.util.Scanner;

public class Zad112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many kilometers were driven?: ");
        double kilometers = input.nextDouble();
        System.out.println("How many liters of fuel were consumed?: ");
        double liters = input.nextDouble();

        double kilometersPerLiter = kilometers / liters;
        System.out.println("Your car does " + kilometersPerLiter + " km/dm3 of fuel");

    }
}
