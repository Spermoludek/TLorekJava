import java.util.Scanner;

public class Zad29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj odleglość na jaką chcesz przesłać przesyłkę [km]: ");
        int dist = in.nextInt();
        int distPrice = dist/500;
        System.out.println("Podaj wagę przesyłki [kg]: ");
        double weight = in.nextDouble();
        double price = 0;
        if (weight < 1) {
            price = distPrice*1.1;
        }
        else if (weight >= 1 && weight < 3) {
            price = distPrice*2.2;
        }
        else if (weight >= 3 && weight < 5) {
            price = distPrice*3.7;
        }
        else if (weight >= 1) {
            price = distPrice*3.8;
        }
        System.out.printf("Cena dowozu przesyłki na podaną odległość wynosi %.2f zł", price);



    }

}
