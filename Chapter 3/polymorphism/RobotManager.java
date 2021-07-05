package polymorphism;

public class RobotManager {
    public static void main(String[] args) {
        //первое проявление полиморфизма - ссылке на класс-предок можно присвоить класс-потомок
        Robot robot = new RobotTotal(0, 0);
        System.out.println(robot.getClass().getName());
        robot.forward(20);
        robot.setCourse(90);
        robot.forward(20);
        robot.setCourse(90);
        robot.forward(50);
        //печать координат
        robot.printCoordinates();

        //System.out.println("Total distance = " + robot.getTotalDistance);
    }
}
