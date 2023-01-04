import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i<=15){
//            System.out.print(i + " ");
//            i++;
//        }

//        CODE REFACTORED

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        };

//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);

//        CODE REFACTORED

//        for(int x = 0; x <= 100; x+=2){
//            System.out.println(x);
//        };

//
//        int y = 100;
//        do {
//            System.out.println(y);
//            y -= 5;
//        } while (y >= -10);

//        CODE REFACTORED

//        for(int y = 100; y >= -10; y -= 5){
//            System.out.println(y);
//        };

//
//        long d = 2;
//        do {
//            System.out.println(d);
//            d *= d;
//        } while (d < 1000000);

//        CODE REFACTORED

//        for(long d = 2; d < 1000000; d *= d){
//            System.out.println(d);
//        };
//
//
//        for (int i=1; i<=100; i++ ){
//            if(((i%3)==0) && ((i%5)==0)){
//                System.out.println("fizzbuzz");
//            } else if((i%3)==0){
//                System.out.println("fizz");
//            }else if((i%5)==0){
//                System.out.println("buzz");
//            }else{
//                System.out.println(i);
//            }
//        };


//        Scanner scanner = new Scanner(System.in);
//        boolean userContinue = true;
//        do {
//            System.out.println("Please enter an integer you would like to go to.");
//            int userInput = Integer.parseInt(scanner.next());
//            System.out.println("Here is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------ | ------");
//            for (int i = 1; i <= userInput; i++) {
//                System.out.printf("%-6d | %-7d | %d\n", i, i * i, i * i * i);
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinue = false;
//            }
//        } while(userContinue);


        Scanner scanner = new Scanner(System.in);
        boolean userContinue = true;

        do{
            System.out.println("Please enter a numbered grade from 0 to 100.");
            int numberGrade = scanner.nextInt();
            if(numberGrade >= 88){
                System.out.println("Your Grade is an: A");
            }else if (numberGrade >= 80){
                System.out.println("Your Grade is an: B");
            }else if (numberGrade >= 67){
                System.out.println("Your Grade is an: C");
            }else if (numberGrade >= 60){
                System.out.println("Your Grade is an: D");
            }else{
                System.out.println("Your Grade is an: F");
            }

            System.out.println("Would you like to enter another number (y/n)?");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinue = false;
            }

        }while(userContinue);






    }
}
