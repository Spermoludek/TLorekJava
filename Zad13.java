public class Zad13 {
    public static void main(String[] args) {
     char sign = '*';
     int cols = 7;
     int rows = 7;
    for (int i = 0; i < cols; i++) {
        System.out.print("\s");
        for (int j = 0; j < rows; j++) {
            System.out.println(sign);
        }
        System.out.print('\n');
    }

    }
}
