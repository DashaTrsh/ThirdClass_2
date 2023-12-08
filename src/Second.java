// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Second {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        double weightKg = 98;
        double index = service.calculate(heightM, weightKg);
        int indexWhole = (int) index;
        System.out.println(indexWhole);
    }
}
