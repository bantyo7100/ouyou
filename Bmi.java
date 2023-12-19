import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 2; i++) {
            System.out.println("身長を入力してください");
            double height = sc.nextDouble();
            System.out.println("体重を入力してください");
            double weight = sc.nextDouble();
            double bmi = weight / ((height / 100) * (height / 100));
            System.out.println("BMI値は" + bmi + "です");
        }
    }
}