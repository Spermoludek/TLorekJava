import java.util.Scanner;

public class Zad110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();
        char firstIntial = firstName.charAt(0);

        System.out.println("Please enter your middle name: ");
        String middleName = input.nextLine();
        char middleIntial = middleName.charAt(0);


        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();
        char lastIntial = lastName.charAt(0);

        String intials = firstIntial+"."+middleIntial+"."+lastIntial+".";

        System.out.println("Your initials are: " + intials);


    }
}
