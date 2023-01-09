import java.util.Scanner;
import java.util.Random;


public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(add(2, 4));
//
//        System.out.println(subtract(8, 3));
//
//        System.out.println(multiplication(9, 3));
//
//        System.out.println(division(15, 3));
//
//        System.out.println(modulus(13, 3));

        System.out.println("Please enter a number between 1 to 100: ");
        int userInput = getInteger(1, 100);
        System.out.println("Your input: " + userInput);

//        calculateFactorial();

        diceRoll();

        

    }
    public static double add(double a, double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }

    public static double division(double a, double b){
        return a/b;
    }

    public static double modulus(double a, double b){
        return a%b;
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if(userInput > min && userInput < max){
            return userInput;
        }else {
            System.out.print("Sorry, Please enter a number between " + min + " and " + max + ": ");
            return getInteger(min, max);
        }
    }



    public static void calculateFactorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 10: ");
        int base = getInteger(1, 10);
        long factorial = 1;
        String output = "! = 1";
        System.out.printf("1%s\n", output);
        for (int i=2; i<=base; i++) {
            factorial *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n", i, output, factorial);
        }
    }

    public static void diceRoll(){
        System.out.print("Please enter the number of dice you want to roll: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDice = scanner.nextInt();
        Random randomNumber = new Random();
        for(int i=0; i< numberOfDice; i++){
            System.out.print(randomNumber.nextInt(6)+ 1);
            System.out.print(" ");
        }

    }






}


