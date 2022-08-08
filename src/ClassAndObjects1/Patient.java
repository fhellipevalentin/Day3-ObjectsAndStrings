package ClassAndObjects1;

public class Patient {
    public String name;
    public Double weight;
    public Double height;

    public Patient(String name, Double weight, Double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    double calculateBMI () {
        return (weight / (height * height)) * 703;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name=' " + name + '\'' +
                ", weight in pounds = " + weight +
                ", height in pounds = " + height + '\'' +
                " - his/her BMI: " + calculateBMI();
    }
}

class Patients {
    public static void main(String[] args) {

        Patient patient = new Patient("Lili",59.00*2.2,164.0/2.54);
        System.out.println(patient);
    }
}

