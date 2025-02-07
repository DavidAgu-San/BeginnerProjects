import java.util.Scanner;
public class CalcSantosDemo
{
    public static void main(String[]args){
        CalcSantos input = new CalcSantos();
        int choice;
        do {
            input.readInput();
            input.writeOutput();
            double sum = input.add();
            double dif = input.sub();
            double quo = input.div();
            double pro = input.mult();
            System.out.println("enter 1 if you want to add:  ");
            System.out.println("enter 2 if you want to subtract: ");
            System.out.println("enter 3 if you want to divide:  ");
            System.out.println("enter 4 if you want to multiply: ");
            Scanner Keyboard = new Scanner(System.in);
            choice = Keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("the sum of the two numbers is: " + sum);
                    break;
                case 2:
                    System.out.println("the difference of the two numbers is: " + dif);
                    break;
                case 3:
                    System.out.println("the quotient of the two numbers is: " + quo);
                    break;
                case 4:
                    System.out.println("the product of the two numbers is: " + pro);
                    break;
                default:
                    System.out.println("Error");
            }

        }
        while (choice >= 1 && choice <= 4) ;




    }
}