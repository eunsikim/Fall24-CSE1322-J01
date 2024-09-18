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
    public static void playRound(Entity one, Entity two) {
        one.takeDamage(two.attack());
        System.out.println(one);

        two.takeDamage(one.attack());
        System.out.println(two);
        System.out.println();
    }

    public static void main(String[] args) {
        Player[] entityArr = new Player[5]; // We can only store Player type!
        entityArr[0] = new Player(0, null);
        entityArr[1] = new Archer(0, null); // To store Player and Archer, we need an array of Entity

        Entity playerOne = new Player(100, "Player One");
        Entity shapeshifter = new Archer(100, "The Shapeshifter: Archer Mode");

        System.out.println(playerOne);
        System.out.println(shapeshifter);
        System.out.println();

        playRound(playerOne, shapeshifter);

        shapeshifter = new Mage(shapeshifter.getHP(), "The Shapeshifter: Mage Mode");

        playRound(playerOne, shapeshifter);

        shapeshifter = new Warrior(shapeshifter.getHP(), "The Shapeshifter: Warrior Mode");
        playRound(playerOne, shapeshifter);
    }
}