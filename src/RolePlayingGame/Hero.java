package RolePlayingGame;

import java.util.Random;

public class Hero extends Entity {
    private int heroZoloto; // количество золота у игрока
    private int heroPoints; // количество очков опыта у игрока
    private int level;


    Hero(String name, int attackPower, int agility) {
        super(name, attackPower, agility);
        this.heroZoloto = 0;
        this.heroPoints = 0;
        this.level = 1; // начальный уровень игры
    }
    @Override
    public int attack(){ //метод атаки игрока
        Random random = new Random();
        if (agility * 3 > random.nextInt(100)) {
            double probability = 0.2; // 20% вероятность
            if (random.nextDouble() < probability) {
                int attackPowerMax = attackPower * 2;
                System.out.print("Сила удара увеличена в 2 раза: ");
                return attackPowerMax; // Увеличиваем силу удара в 2 раза - усиленная атака
            }
            return attackPower; // Успешная атака
        } else {
            return 0; // Промах
        }
    }
    public void takeGold(int amount) {//получить золото
        heroZoloto += amount;
    } // получить золото за победу
    public void takePoints(int amount) { // получить очки(опыт) за победу
        heroPoints += amount;
    }
    public int getHeroPoints() { // геттер - получить количество очков опыта
        return heroPoints;
    }
    public int getLevel() { // геттер - получить номер текущего уровня игры
        return level;
    }

    public void levelUp() { // повышение уровня игры на 1
        level++;
        System.out.println("Поздравляем! Вы перешли на уровень " + level);
    }
}
