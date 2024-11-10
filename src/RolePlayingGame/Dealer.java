package RolePlayingGame;

public class Dealer {
    public void sellPotion(Hero player) {
        // Покупаем у торговца зелье для восстановления здоровья
        player.getDamage(-2); // Восстановление 2 единиц здоровья
        player.takeGold(-5); // плата за покупку зелья
        System.out.println("Вы купили лечебное зелье! Теперь у вас " + player.hp + " единиц(ы) здоровья.");
    }
}
