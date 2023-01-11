import java.util.Scanner;
import java.lang.Math;

public class HighLow {

    public static int randomNumber(){
        return (int)(Math.random()* 100)+1;
    }
    public static int guessConfirm(){
        int min = 1;
        int max = 100;
        System.out.println("Take a younder of a number between 1 and 100!");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > max || input <min){
            System.out.printf("Sorry that is not a valid number! Please enter a number between %s to %s:", min, max);
            System.out.println();
            return guessConfirm();
        }
        System.out.printf("You entered %s!", input);
        return input;
    }

    public static int guessNumber(int randomNum){
        System.out.println(randomNum);
        int number = 0;
        System.out.println();
        while(number != randomNum){
            number = guessConfirm();
            System.out.println();
            if(number > randomNum){
                System.out.println("LOWER");
            }
            else if(number < randomNum){
                System.out.println("HIGHER");
            }
        }
        if (number == randomNum){
            System.out.print("Bingo! you got it!!");
        }
        return number;
    }

    public static void main(String[] args){
        guessNumber(randomNumber());
    }



//    class ArithmeticSample {
//        public static void main(String[] args) {
//            int x = 5 * 4 % 3;
//            System.out.println(x);
//        }}


}
