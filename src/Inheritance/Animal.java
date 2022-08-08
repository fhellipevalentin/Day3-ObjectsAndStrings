package Inheritance;

public class Animal {
    void eat() {
    }

    void sleep() {
    }

}

class Bird extends Animal {

    void fly() {

    }

    @Override
    void eat() {

    }

    @Override
    void sleep() {
    }

    public static void main(String[] args) {

        Bird bird = new Bird();

        bird.eat();
        bird.sleep();
        bird.fly();

    }
}

