package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        do{
            double rad = input.getDouble(0, 100);
            Circle circle = new Circle(rad);
            System.out.println("circle.getCircumference() = " + circle.getCircumference());
            System.out.println("circle.getArea() = " + circle.getArea());
        } while (input.yesNo("Do you want to continue?"));
        System.out.printf("You created %d circles.", Circle.circleCount);
    }






}
