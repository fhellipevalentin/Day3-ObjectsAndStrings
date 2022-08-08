package Inheritance3;

public class Student extends Person{
    private Integer registrationNumber;

    public Student(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Student(String name, Integer age, Double height, Integer registrationNumber) {
        super(name, age, height);
        this.registrationNumber = registrationNumber;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
