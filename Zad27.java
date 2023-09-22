import java.util.Arrays;
import java.util.Scanner;


public class Zad27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj pierwsze imię: ");
        String name1 = in.nextLine();
        System.out.println("Podaj drugie imię: ");
        String name2 = in.nextLine();
        System.out.println("Podaj trzecie imię: ");
        String name3 = in.nextLine();
        String[] names = {name1, name2, name3};
        Arrays.sort(names);
        for (int i = 0; i < names.length ; i++ ) {
            System.out.println(names[i]);
        }
    }
}


// Jeśli name1 jest pierwsze to -1
// Jeśli name2 jest piewrsze to 1
// Jeśli są równe to 0