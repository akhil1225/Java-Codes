// Interface for animals
interface Animal {
    void eat();
}

// Interface for flying animals
interface FlyingAnimal extends Animal {
    void fly();
}

// Interface for swimming animals
interface SwimmingAnimal extends Animal {
    void swim();
}

// Concrete class: Bird
class Bird implements FlyingAnimal {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Concrete class: Fish
class Fish implements SwimmingAnimal {
    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// Concrete class: FlyingFish (demonstrating multiple inheritance)
class FlyingFish implements FlyingAnimal, SwimmingAnimal {
    @Override
    public void eat() {
        System.out.println("FlyingFish is eating");
    }

    @Override
    public void fly() {
        System.out.println("FlyingFish is flying");
    }

    @Override
    public void swim() {
        System.out.println("FlyingFish is swimming");
    }
}

// Interface extending another interface
interface WalkingAnimal extends Animal {
    void walk();
}

// Concrete class: Dog (demonstrating interface extending another interface)
class Dog implements WalkingAnimal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}

// Usage in the main class
public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.fly();

        Fish fish = new Fish();
        fish.eat();
        fish.swim();

        FlyingFish flyingFish = new FlyingFish();
        flyingFish.eat();
        flyingFish.fly();
        flyingFish.swim();

        Dog dog = new Dog();
        dog.eat();
        dog.walk();
    }
}
