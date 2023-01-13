package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student dereck = new Student ("Dereck");
        Student chris = new Student ("Chris");
        Student enrique = new Student ("Enrique");

        dereck.addGrade(85);
        dereck.addGrade(80);
        dereck.addGrade(90);
        dereck.addGrade(95);

        chris.addGrade(95);
        chris.addGrade(98);
        chris.addGrade(80);
        chris.addGrade(79);


        enrique.addGrade(100);
        enrique.addGrade(90);
        enrique.addGrade(80);
        enrique.addGrade(82);


        System.out.println(dereck.getGradeAverage());
        System.out.println(chris.getGradeAverage());
        System.out.println(enrique.getGradeAverage());

    }
}
