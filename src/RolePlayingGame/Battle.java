package RolePlayingGame;

import java.util.Random;

public class Battle implements Runnable {
    private Hero player;
    private Monster monster;
    public Battle(Hero player) {
        this.player = player;
        this.monster = spawnMonster();

    }
    private Monster spawnMonster() {//вероятность появления конкретного монстра 50%
        Random rand = new Random();
        return rand.nextBoolean() ? new Goblin() : new Skelet();
    }
    @Override
    public void run() {
        System.out.println("Монстр " + monster.getName() + " появился!");
        while (player.isAlive() && monster.isAlive()) {
            // Игрок атакует
            int playerDamage = player.attack();
            if (playerDamage > 0) {
                monster.getDamage(playerDamage);
                System.out.println(player.name + " успешно атаковал монстра " + monster.getName() + " с силой урона " + playerDamage);
            } else {
                System.out.println("Игрок " + player.name + " промахнулся ");
            }

            if (!monster.isAlive()) {
                System.out.println("Монстр " + monster.getName() + " убит!");
                player.takeGold(5); // игрок получил золото за победу
                player.takePoints(1); // игрок получил очки(опыт) за победу
                if (player.getHeroPoints() >= 50) { // условие для повышения уровня игры
                    player.levelUp();
                }
                break;
            }

            // Монстр атакует
            int monsterDamage = monster.attack();
            player.getDamage(monsterDamage);
            System.out.println("Монстр " + monster.getName() + " атаковал с силой урона " + monsterDamage);

            if (!player.isAlive()) {
                System.out.println("Игрок " + player.name + " убит!");
                System.out.println("Игра окончена...");
                System.exit(0);
            }
        }
    }
}
