package OverridingPolymorphism;

public class Fruit {

    private String name;
    private String flavor;

    public Fruit(String name, String flavor) {
        this.name = name;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    void eat() {
        
    }
}
