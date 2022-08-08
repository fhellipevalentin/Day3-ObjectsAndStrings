package ClassAndObjects1;

public class Calculator {

    static double powerInt(int num1, int num2) {
        return Math.pow(num1,num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1,num2);
    }


    public static void main(String[] args) {

        System.out.println(Calculator.powerInt(3,5));
        System.out.println(Calculator.powerDouble(2.4,2));
    }
}
