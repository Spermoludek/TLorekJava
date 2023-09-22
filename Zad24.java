import java.util.Scanner;

public class Zad24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój wynik z 1# testu: ");
        int test1 = in.nextInt();
        System.out.println("Podaj swój wynik z 2# testu: ");
        int test2 = in.nextInt();
        System.out.println("Podaj swój wynik z 3# testu: ");
        int test3 = in.nextInt();





        int result = (test1 + test2 + test3)/3;

        if (result < 60) {
            System.out.println("Bomba");
        }
        else if (result >= 60 && result < 70) {
            System.out.println("Dopuszczający");
        }
        else if (result >= 70 && result < 80) {
            System.out.println("Dostateczny");
        }
        else if (result >= 80 && result < 90) {
            System.out.println("Dobry");
        }
        else if (result >= 90) {
            System.out.println("Celujący");
        }


    }
}
