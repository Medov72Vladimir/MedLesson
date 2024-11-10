package RolePlayingGame;

public class Entity {
    protected String name; // имя сущности
    protected int attackPower; // сила удара сущности
    protected int agility; // ловкость сущности
    protected int hp = 100; // количество жизней у сущности


    Entity(String name, int attackPower, int agility){
        this.name = name;
        this.attackPower = attackPower;
        this.agility = agility;
    }
    public int attack() {
        return 0;
    }
    public boolean isAlive() { // true - живой, false - убит
        return hp > 0;
    }
    public void getDamage(int damage) { // уменьшает количество жизни сущности после успешной атаки
        hp -= damage;
        if (hp <= 0) hp = 0;
    }

}
