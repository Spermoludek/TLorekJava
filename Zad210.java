import java.util.Scanner;

public class Zad210 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of calories: ");
        double calories = in.nextDouble();
        System.out.println("Enter the grams of fat contained: ");
        double grams = in.nextDouble();
        double calInFat = grams*9;
        if (calInFat > calories) {
            System.out.println("Nieprawidłowe dane");
            System.exit(0);
        }
        double percentageOfFat = (calInFat/calories)*100;
        System.out.println(percentageOfFat);
        if (percentageOfFat < 30.0) {
            System.out.println("Produkt jest niskotłuszczowy, zawartość tłuszczu: " + percentageOfFat + "%");
        }
        else {
            System.out.println("Zawartość tłuszczu: " + percentageOfFat + "%");
        }


    }
}
