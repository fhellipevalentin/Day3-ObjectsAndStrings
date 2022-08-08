package Inheritance3;

public class CollegeStudent extends Student{
    private Integer year;
    private String major;

    public CollegeStudent(String name, Integer age, Double height, Integer registrationNumber, Integer year, String major) {
        super(name, age, height, registrationNumber);
        this.year = year;
        this.major = major;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
