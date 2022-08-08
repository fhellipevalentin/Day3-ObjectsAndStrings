package Inheritance3;

public class Teacher extends Person{
    private Double salary;
    private String subject;

    public Teacher(String name, Integer age, Double height, Double salary, String subject) {
        super(name, age, height);
        this.salary = salary;
        this.subject = subject;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
