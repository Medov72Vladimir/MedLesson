package Module_02;
/*
Задача 2
Необходимо вычислить индекс массы тела человека. Указать на проблему,
если индекс показал критическое значение, вывести сообщение о проблеме (если таковая имеется).
Самостоятельно найдите формулу расчета и реализуйте алгоритм с использованием изученного ранее материала.
 */
import java.util.Scanner;
public class BodyMassIndex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш рост в метрах: ");
        double height = scanner.nextDouble();
        System.out.print("Введите ваш вес в кг");
        double body_mass = scanner.nextDouble();
        double index_body_mass = body_mass / (height * height);
        System.out.println(index_body_mass);
    }
}
