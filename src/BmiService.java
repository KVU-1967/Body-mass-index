public class BmiService {
    public int calculate(int a, double b) {
        int bmi;
        int weight = a;
        double height = b;
        double h;
        h = Math.pow(height, 2);
        int index;
        bmi = (int) (weight / h);
        return bmi;
    }
}
