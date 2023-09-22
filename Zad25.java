import java.util.Scanner;

public class Zad25 {
    public static void main(String[] args) {
        double gravAcceleration = 9.81;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mass of the object [kg]: ");
        double mass = input.nextDouble();

        double force = mass * gravAcceleration;

        if (force > 1000 ) {
            System.out.println("The object is too heavy");
            return;
        }
        if (force < 10) {
            System.out.println("The object is too lightweight");
            return;
        }
        System.out.printf("The object's weight is %.2f Newtons", force);

    }
}

