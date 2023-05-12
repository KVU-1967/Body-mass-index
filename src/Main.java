public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 85;
        double height = 1.9;
        int bmi = service.calculate(weight, height);
        System.out.println("Your Body mass index:" + bmi);

    }
}