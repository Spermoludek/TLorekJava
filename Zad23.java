import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoją wagę [kg]: ");
        int weight = in.nextInt();
        System.out.println("Podaj swój wzrost [m]: ");
        double height = in.nextDouble();

        double BMI = weight/(height*height);

        if (BMI < 18.5) {
            System.out.println("Jedz więcej");
        }
        else if (BMI > 25) {
            System.out.println("Jedz mniej");
        }
        else {
            System.out.println("Twoje BMI jest normalne");
        }
    }
}
