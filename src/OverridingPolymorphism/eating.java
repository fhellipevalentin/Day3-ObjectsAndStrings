package OverridingPolymorphism;

public class eating {
    public static void main(String[] args) {
        Fruit apple = new Apple("apple", "sweet and caramelized");
        Fruit orange = new Orange("orange", "sweet and sour");
        apple.eat();
        orange.eat();
    }
}
