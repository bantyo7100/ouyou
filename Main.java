import java.util.Scanner;

public class Main {
    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("身長を入力してください");
        double height = sc.nextDouble();
        System.out.println("体重を入力してください");
        double weight = sc.nextDouble();
        double bmi = (weight / (height*height));
        System.out.println("BMI値は" + bmi + "です");
    }
}