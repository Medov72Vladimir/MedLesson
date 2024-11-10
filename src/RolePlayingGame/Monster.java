package RolePlayingGame;

abstract class Monster extends Entity{

    Monster(String name, int attackPower) {
        super(name, attackPower, 0);
    }
    @Override
    public int attack() {
        return attackPower;
    } // метод атаки любого из монстров
    public String getName() { // получить имя монстра
        return name;
    }


}
