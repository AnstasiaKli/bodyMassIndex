public class BmiService {

    public double calculate(double m, double h) {
        double Bmi = m / (h * h);
        return Bmi;
    }
}