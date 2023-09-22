import java.util.Scanner;

public class Zad212 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ośrodek w jakim ma się rozchodzić dźwięk: stal, woda, powietrze: ");
        String env = in.nextLine();
        int velocity = 0;
        env = env.toLowerCase();
        switch (env) {
            case "powietrze":
                velocity = 343;
                break;
            case "woda":
                velocity = 1490;
                break;
            case "stal":
                velocity = 5100;
                break;
            default:
                System.out.println("Spróbuj ponownie");


        }
        System.out.println("Podaj odległość [m]: ");
        double dist = in.nextDouble();

        double time = dist / velocity;
        System.out.printf("Czas rozchodzenia się dźwięku na podanej odległości i ośrodku wynosi: %.4f sekund", time);

        }


    }

