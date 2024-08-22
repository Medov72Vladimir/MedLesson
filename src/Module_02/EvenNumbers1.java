package Module_02;
/*
Задача 1.
Создайте цикл, выводящий на экран чётные цифры из диапазона от 2 до 10 включительно
 */
public class EvenNumbers1 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
