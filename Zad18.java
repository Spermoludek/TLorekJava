import java.util.Scanner;
public class Zad18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String unit = " Square meters";
        System.out.println("Please enter the width of room 1: ");
        int widthRoom1 = input.nextInt();
        System.out.println("Please enter the length of room 1: ");
        int lengthRoom1 = input.nextInt();
        System.out.println("Please enter the width of room 2: ");
        int widthRoom2 = input.nextInt();
        System.out.println("Please enter the length of room 2: ");
        int lengthRoom2 = input.nextInt();
        System.out.println("Please enter the width of room 3: ");
        int widthRoom3 = input.nextInt();

        System.out.println("Please enter the length of room 3:");
        int lengthRoom3 = input.nextInt();
        System.out.println("Please enter the width of room 4: ");
        int widthRoom4 = input.nextInt();
        System.out.println("Please enter the length of room 4: ");
        int lengthRoom4 = input.nextInt();

        int room1 = widthRoom1 * lengthRoom1;
        int room2 = widthRoom2 * lengthRoom2;
        int room3 = widthRoom3 * lengthRoom3;
        int room4 = widthRoom4 * lengthRoom4;


        int condoArea = room1 + room2 + room3 + room4;
        int personalArea = condoArea / 4;
        System.out.println("Surface area of room 1: " + room1 + unit);
        System.out.println("Surface area of room 2: " + room2 + unit);
        System.out.println("Surface area of room 3: " + room3 + unit);
        System.out.println("Surface area of room 4: " + room4 + unit);
        System.out.println("Total area of the condo: " + condoArea + unit);
        System.out.println("Area per person: " + personalArea);
    }
}
