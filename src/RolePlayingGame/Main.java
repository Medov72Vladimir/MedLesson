package RolePlayingGame;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра <Битва с монстрами>");
        System.out.print("Введите имя для вашего персонажа: ");
        String heroName = scanner.nextLine();
        Hero hero = new Hero(heroName, 10, 10);
        Dealer dealer = new Dealer();
        System.out.println("Отлично! Создан игрок " + hero.name);
        while (true) {
            System.out.println("Куда вы хотите пойти: ");
            System.out.println("1. К торговцу");
            System.out.println("2. В тёмный лес");
            System.out.println("3. На выход");
            System.out.print("Сделайте ваш выбор (нажмите цифру от 1 до 3):  ");
            int path = scanner.nextInt();
            switch (path) {
                case 1:
                    dealer.sellPotion(hero);
                    break;
                case 2:
                    Battle battle = new Battle(hero);
                    Thread battleThread = new Thread(battle);
                    battleThread.start();

                    // Ждем завершения боя
                    try {
                        battleThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Конец игры");
                    System.exit(0);
            }
        }
    }
}
