import java.util.Scanner;

public class Zad123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter the length of the wall: ");
        double lenOfLine = input.nextDouble();

        System.out.println("Enter the length of the frame: ");
        double lenOfFrame = input.nextDouble();

        System.out.println("Enter the distance between the saplings: ");
        double saplingsDistance = input.nextDouble();

        double numOfSaplings = (lenOfLine - 2*lenOfFrame) / saplingsDistance;
        System.out.println("With params provided you can fit " + numOfSaplings +" saplings in-line");
    }
}
