package Inheritance2;

public class Employee extends Person{
    private Double annualSalary;
    private Integer yearStart;
    private String nationalInsuranceNumber;

    private Person person;
    public Employee(String name, Double annualSalary, Integer yearStart, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStart = yearStart;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

class TestEmployee {
    Employee emp = new Employee("Bob", 1880.00, 2022, "3212685465");
}

