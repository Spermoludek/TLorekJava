import java.util.Scanner;

public class Zad121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Ile pieniędzy znajduje się aktualnie na Twoim koncie?: ");
        double moneyNow = input.nextDouble();

        System.out.println("Na ile lat chciałbyś ulokować swoje pieniądze?: ");
        int numOfYears = input.nextInt();


        System.out.println("Podaj roczną stopę oprocentowania [%]: ");
        double interestRate = input.nextDouble();
        interestRate /= 100;

        System.out.println("Ile razy w roku naliczane są odsetki?: ");
        int numOfIncreases = input.nextInt();


        double moneyInX = moneyNow * Math.pow((1 + (interestRate/numOfIncreases)), (numOfIncreases*numOfYears));

        System.out.println("Za " + numOfYears + " lat będziesz miał: " +  moneyInX +" PLN");



    }

}
