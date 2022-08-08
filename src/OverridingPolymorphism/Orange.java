package OverridingPolymorphism;

public class Orange extends Fruit{
    public Orange(String name, String flavor) {
        super(name, flavor);
        this.setName(name);
        this.setFlavor(flavor);

    }

    @Override
    void eat() {
        System.out.println(this.getName() + " is " + this.getFlavor() + "in taste");
    }
}
