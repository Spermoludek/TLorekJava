import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 3999: ");
        int roman = input.nextInt();
        int r = roman;
        if (roman >= 4000 || roman < 0) {
            System.out.println("Naucz się czytać padalcu");
            System.exit(0);
        }
        String[] romanNumerals = {"M", "CM", "C", "CD", "C", "XC", "L", "XL", "X", "XI", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String output = "";
        for (int i = 0; i < romanNumerals.length; ++i) {
            while (r - values[i] >= 0) {
                output += romanNumerals[i];
                r -= values[i];
            }
        }
        System.out.println("Liczba " + roman + " to " + output + " w systemie rzymskim");


    }





}
