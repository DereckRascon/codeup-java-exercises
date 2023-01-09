package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        do{
            double rad = input.getDouble(0, 100);
            Circle quater = new Circle(rad);
            System.out.println("quater.getCircumference() = " + quater.getCircumference());
            System.out.println("quater.getArea() = " + quater.getArea());
        } while (input.yesNo("Do you want to continue?"));
        System.out.printf("You created %d circles.", Circle.circleCount);
    }
}
