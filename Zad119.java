public class Zad119 {
    public static void main(String[] args) {
        int surveys = 12467;
        double consumentsOfEnergyDrinks = 12467 * 0.14;
        double consumentsOfCitrusEnergy = consumentsOfEnergyDrinks*0.64;
        System.out.println("Results from the poll show approx. " + (int)consumentsOfEnergyDrinks + " consume energy drinks at least once a week ");
        System.out.println((int)consumentsOfCitrusEnergy + " of which prefer citrus flavour");
    }
}
