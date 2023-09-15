public class Zad15 {
    public static void main(String[] args) {
        String unit = "Meters";
        int room1 = 2*2;
        int room2 = 2*3;
        int rooms2and3 = 3*4;
        int condoArea = room1+room2+rooms2and3;
        System.out.println("Surface area of room 1: " + room1 + unit);
        System.out.println("Surface area of room 2: " + room2 + unit);
        System.out.println("Surface area of rooms 3 and 4: " + rooms2and3 + unit);
        System.out.println("Total area of the condo: " + condoArea + unit);

    }
}
