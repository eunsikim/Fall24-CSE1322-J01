abstract class Entity {
    private int hp;
    private int damage;
    private boolean isAlive;
    private String name;

    public Entity(int hp, String name, int damage) {
        this.hp = hp;
        this.name = name;
        this.damage = damage;
        this.isAlive = true;
    }

    abstract public int attack();

    public void takeDamage(int damage) {
        this.hp -= damage;

        if (hp < 0) {
            this.isAlive = false;
        }
    }

    public int getHP() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return isAlive;
    }
}

class Archer extends Entity {
    public Archer(int hp, String name) {
        super(hp, name, 4);
    }

    @Override
    public int attack() {
        System.out.println(getName() + " Deals " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return getName() + " has " + getHP() + " HP left!";
    }
}

class Warrior extends Entity {
    public Warrior(int hp, String name) {
        super(hp, name, 10);
    }

    @Override
    public int attack() {
        System.out.println(getName() + " Deals " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return getName() + " has " + getHP() + " HP left!";
    }
}

class Mage extends Entity {
    public Mage(int hp, String name) {
        super(hp, name, 7);
    }

    @Override
    public int attack() {
        System.out.println(getName() + " Deals " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return getName() + " has " + getHP() + " HP left!";
    }
}

class Player extends Entity {
    public Player(int hp, String name) {
        super(hp, name, 20);
    }

    @Override
    public int attack() {
        System.out.println("You deal " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return "You have " + getHP() + " HP left!";
    }
}

public class ExampleA {
    public void playRound(Entity one, Entity two) {
        one.takeDamage(two.attack());
        System.out.println(one);

        two.takeDamage(one.attack());
        System.out.println(two);
        System.out.println();
    }

    public static void main(String[] args) {
        Entity player1 = new Player(100, "Player One");

        Entity shapeshifterEnemy = new Archer(100, "Shapeshifter Enemy Archer");

        shapeshifterEnemy = new Mage(shapeshifterEnemy.getHP(), "Shapeshifter Enemy Mage");

        player1.takeDamage(shapeshifterEnemy.attack());
        System.out.println(player1);

        shapeshifterEnemy.takeDamage(player1.attack());
        System.out.println(shapeshifterEnemy);
        System.out.println();

        shapeshifterEnemy = new Warrior(shapeshifterEnemy.getHP(), "Shapeshifter Enemy Warrior");

        player1.takeDamage(shapeshifterEnemy.attack());
        System.out.println(player1);

        shapeshifterEnemy.takeDamage(player1.attack());
        System.out.println(shapeshifterEnemy);
        System.out.println();
    }
}