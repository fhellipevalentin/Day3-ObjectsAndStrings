package EncapsulationAbstraction;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author() {}

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        gender = gender;
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

