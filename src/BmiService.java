public class BmiService {
    public double calculate (double heightM, double weightKg) {
        double index = weightKg/ Math.pow(heightM,2);
        return index;
    }
}
