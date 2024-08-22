package Module_02;
import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int random_number = random.nextInt(10) + 1;
        while (true){
            System.out.print("Введите ваше число: ");
            int number = scanner.nextInt();
            if (number == random_number) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                System.exit(0);
            } else if (number > random_number) {
                System.out.println("Загаданное мною число меньше");
            } else {
                System.out.println("Загаданное мною число больше");
            }
        }
    }
}
