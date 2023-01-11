public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 51;
        double h = 1.64;
        double myBmi = service.calculate(m, h);
        String result = String.format("%.2f", myBmi);
        System.out.println(result);
    }
}
