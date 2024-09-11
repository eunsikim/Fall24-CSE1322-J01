class Animal {
    String name;
    int numOfLegs;

    public Animal(String name, int numOfLegs) {
        this.name = name;
        this.numOfLegs = numOfLegs;
    }

    public void makeNoise() {
        System.out.println("I am an animal");
    }
}

class Mammal extends Animal {
    public Mammal(String name, int numOfLegs) {
        super(name, numOfLegs);
    }
}

class Dog extends Mammal {
    public Dog(String name, int numOfLegs) {
        super(name, numOfLegs);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}

public class ExampleA {
    public static void main(String[] args) {
        Dog d1 = new Dog("Fido", 4);
        d1.makeNoise();

        Animal a1 = new Animal("asdqwe", 2);
        a1.makeNoise();
    }
}