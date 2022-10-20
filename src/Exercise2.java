import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti greutatea in kg:");
        float weightInKg = scanner.nextFloat();
        System.out.println("Introduceti intaltimea in cm");
        int heightInCm = scanner.nextInt();
        float heightInM = (float) heightInCm / 100;
        float bmi = weightInKg / (heightInM * heightInM);
        boolean bmiIsOptimal = 18.5 < bmi && bmi < 24.9;
        if (bmiIsOptimal) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI NOT optimal");
        }

    }
}
