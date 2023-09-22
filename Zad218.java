import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zad218 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej? Y / N: ");
        String vegetarian = input.nextLine();
        System.out.println("Czy któraś z osób jest na diecie wegańskiej? Y / N: ");
        String vegan = input.nextLine();
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej? Y / N: ");
        String glutenFree = input.nextLine();

        if (vegetarian.equalsIgnoreCase("Y")) {
                if (glutenFree.equalsIgnoreCase("Y")) {
                    if (vegan.equalsIgnoreCase("Y")) {
                        System.out.println("Kawiarnia na rogu");
                        System.out.println("Kuchnia u szefa");
                    }
                    else {
                        System.out.println("Pizzeria przy Dworcowej");
                        System.out.println("Kawiarnia na rogu");
                        System.out.println("Kuchnia u szefa");
                    }
                }
                else {
                    System.out.println("Włoskie specjały");
                }
        }
        else {
            System.out.println("Luksusowe burgery u Jacka");

        }

    }




}


/*

• Luksusowe Burgery u Jarka — wegetariańskie: nie, wegańskie: nie, bezglutenowe: nie;
• Pizzeria przy Dworcowej — wegetariańskie: tak, wegańskie: nie, bezglutenowe: tak;
• Kawiarnia na Rogu — wegetariańskie: tak, wegańskie: tak, bezglutenowe: tak;
• Włoskie Specjały — wegetariańskie: tak, wegańskie: nie, bezglutenowe: nie;
• Kuchnia u Szefa — wegetariańskie: tak, wegańskie: tak, bezglutenowe: tak.



Wegetariańskie ===> Bezglutenowe ==> Nie ==> Włoskie specjały
		==> Luksusowe Burgery u Jacka
					Tak ===> Wege? ==>  Tak ==> Kawiarnia na Rogu + Kuchnia u Szefa
							    Nie ==> Pizzeria przy Dworcowej




 */