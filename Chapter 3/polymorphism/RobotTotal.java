package polymorphism;

public class RobotTotal extends Robot {
    //вводим поле для хранения пройденной дистанции
    private double totalDistance = 0;

    public RobotTotal(double x, double y) {
        super(x, y);
    }

    @Override
    public void forward(int distance) {
        super.forward(distance);
        totalDistance += distance;
        System.out.println("RobotTotal");
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
