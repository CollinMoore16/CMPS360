package Mod2.polymorphism;


//if you leave out public it defaults to public class anyway

public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a roar");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says oink oink");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says meow meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myPig.animalSound();
        myCat.animalSound();

    }
}
