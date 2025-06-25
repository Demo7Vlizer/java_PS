import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to Java class ");

        //--------------------------------------------
        //---- Adding two numbers ...
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.print("Now, Please enter the second number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of your numbers is: " + sum);

    }
}
