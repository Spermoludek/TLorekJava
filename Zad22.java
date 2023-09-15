import java.util.Scanner;

public class Zad22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in centimeters: ");
        int heightInCentimeters = input.nextInt();

        System.out.println("Enter your weight in kilos: ");
        int weightInKgs = input.nextInt();


        double BMI = weightInKgs / (heightInCentimeters * heightInCentimeters);



    }

}
