import java.util.Scanner;
public class CalcSantos {
    public double num1;
    public double num2;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the first number");
        num1 = keyboard.nextDouble();
        System.out.println("What is the second number");
        num2 = keyboard.nextDouble();
    }

    public void writeOutput() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public double add() {
        double sum = num1 + num2;
        return sum;
    }
    public double sub() {
        double dif = num1 - num2;
        return dif;
    }
    public double div() {
        double quo = num1/num2;
        return quo;
    }
    public double mult() {
        double prod = num1 * num2;
        return prod;
    }
}