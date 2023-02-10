public class BmiService {

    public double calculate(double weight, double height) {
        double a = Math.pow(height, 2);
        double BodyMassIndex = weight / a;
        return BodyMassIndex;
    }
}
