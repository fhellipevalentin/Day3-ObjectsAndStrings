package Inheritance3;

public class HighSchool {

    public static void main(String[] args) {
        CollegeStudent collegeStudent = new CollegeStudent("Jose", 20, 1.88, 12035474, 1999, "Chemistry");
        Teacher teacher = new Teacher("Sophia", 25, 1.67, 3.210, "Communications");

        System.out.println("Teacher's name: " + teacher.getName() + ", age: " + teacher.getAge() +
                ", height: " + teacher.getHeight() + ", salary" + teacher.getSalary() + ", subject: " + teacher.getSubject());
        System.out.print("College student's name: " + collegeStudent.getName() + ", age: " + collegeStudent.getAge() +
                ", height: " + collegeStudent.getHeight() + ", registration number: " + collegeStudent.getRegistrationNumber() +
                ", year: " + collegeStudent.getYear() + ", mayor" + collegeStudent.getMajor());
    }
}
