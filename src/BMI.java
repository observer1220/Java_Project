import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入您的體重(公斤): ");
        double weight = scanner.nextDouble();

        System.out.print("請輸入您的身高(公分): ");
        double height = scanner.nextDouble() / 100;
        double bmi = Double.parseDouble(DF.format(weight / (height * height)));

        System.out.println("您的BMI數值為" + bmi);

        if (bmi < 18.5) {
            System.out.println("您的體重過輕");
        } else if (bmi < 24) {
            System.out.println("您的體重正常");
        } else if (bmi < 30) {
            System.out.println("您的體重微胖");
        } else {
            System.out.println("您的體重過胖");
        }
    }
}
