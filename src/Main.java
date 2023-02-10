public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BodyMassIndex = service.calculate(56.5, 1.67);
        System.out.println("Индекс массы тела: " + BodyMassIndex);
    }
}