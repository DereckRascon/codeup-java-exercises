package grades;


import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        Student dereck = new Student ("Dereck");
        dereck.addGrade(85);
        dereck.addGrade(80);
        dereck.addGrade(90);
        dereck.addGrade(95);

//        System.out.println(dereck.getGradeAverage());

        Student chris = new Student ("Chris");
        chris.addGrade(95);
        chris.addGrade(98);
        chris.addGrade(80);
        chris.addGrade(79);

//        System.out.println(chris.getGradeAverage());


        Student enrique = new Student ("Enrique");
        enrique.addGrade(100);
        enrique.addGrade(90);
        enrique.addGrade(80);
        enrique.addGrade(82);


//        System.out.println(enrique.getGradeAverage());

        Student ariana = new Student ("Ariana");
        ariana.addGrade(100);
        ariana.addGrade(100);
        ariana.addGrade(90);
        ariana.addGrade(95);

//        System.out.println(ariana.getGradeAverage());


        students.put("dereck1@github.com", dereck);
        students.put("chris37@github.com", chris);
        students.put("enrique28@github.com", enrique);
        students.put("ariana32@github.com", ariana);

//        System.out.println(students);

        System.out.println("Welcome!\n" + "\n" + "Here are the GitHub usernames of our students:\n");
        for(String username: students.keySet()){
            System.out.print("|" + username + "|");
        }
        System.out.println();

        System.out.println("\n What student would you like to see more information on?\n");

        boolean run = true;
        while(run){
            String username = input.getString();
            if(students.containsKey(username)){
                students.forEach((k,v)->{
                    if(k.contains(username)){
                        System.out.println("\nName: " + v.getName() + "\nGitHub Username: " + k + "\nGrade Average: " + v.getGradeAverage());
                    }
                });
                System.out.println("\nWould you like to see another student?\n");
            }
            else if(username.equalsIgnoreCase("no")){
                System.out.println("Thank you and have a great day!");
                break;
            }
            else{
                System.out.printf("\nSorry, We have no student by the github username of %s.\n" + "\n" + "Would you like to try again and see another student?\n" + username);
            }
        }

    }
}
