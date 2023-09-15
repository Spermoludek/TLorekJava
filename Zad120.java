import java.util.Scanner;

public class Zad120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sugarPerCookie = 1.5/48;
        double butterPerCookie = 0.0208333;
        double flourPerCookie = 2.75/48;

        System.out.println("How many cookies do you wish to make?: ");
        int numOfCookies = input.nextInt();

        double sugar = sugarPerCookie*numOfCookies;
        double butter = butterPerCookie*numOfCookies;
        double flour = flourPerCookie*numOfCookies;
        System.out.println("To make " + numOfCookies + " you need:");
        System.out.println(sugar + " glasses of sugar");
        System.out.println(butter + " glasses of butter");
        System.out.println(flour + " glasses of flour");

    }
}
