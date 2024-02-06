import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор здоровья");
        System.out.print("Введите свой вес в килограммах: ");
        double weight = scanner.nextDouble();
        System.out.print("Введите свой рост в СМ: ");
        double height = scanner.nextDouble();
        height = height/100;
        System.out.print("Введите свой возраст: ");
        double age = scanner.nextDouble();
        double imt = weight / (height * height);
        double ideal_weight = 24.9 * (height * height);
        double calorie = 655 + (9.6 * weight) + (1.8 * 100 * height) - (4.7 * age);
        if (imt > 24.9){
            System.out.printf("Рекомендуется снизить вес для достижения идеального веса. Идеальный вес: %f кг. Необходимо сбросить: %f кг. Рекомендуемый дневной прием калорий: %f", ideal_weight, weight-ideal_weight, calorie-500);
        }
        else if (imt < 18.5){
            System.out.printf("Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес: %f кг. Необходимо набрать: %f кг. Рекомендуемый дневной прием калорий: %f", ideal_weight, ideal_weight-weight, calorie+500);
        }
        else {
            System.out.printf("Ваш вес находится в пределах нормы. Идеальный вес: %f кг. Рекомендуемый дневной прием калорий: %f", ideal_weight, calorie);
        }
    }
}