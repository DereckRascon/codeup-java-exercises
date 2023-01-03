import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

//        System.out.format("The value of pi is approximately %.2f", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an Integer");

        int userInput = scanner.nextInt();

        System.out.println("userInput = " + userInput);

        System.out.println("Please enter three words");

        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.println("wordOne = " + wordOne);
        System.out.println("wordTwo = " + wordTwo);
        System.out.println("wordThree = " + wordThree);

        System.out.println("Please enter a sentence");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.println("userSentence = " + userSentence);

        System.out.println("Please enter the length of a classroom.");
        int length = parseInt(scanner.nextLine());

        System.out.println("Please enter the width of a classroom.");
        int width = parseInt(scanner.nextLine());

        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.printf("The area is: %d\n", area);
        System.out.printf("The perimeter is: %d\n", perimeter);



    }
}
