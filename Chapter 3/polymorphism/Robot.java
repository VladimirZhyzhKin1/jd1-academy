package polymorphism;

public class Robot {
    private double x = 0;
    private double y = 0;
    private double course = 0;

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //передвижение на дистанцию distance
    public void forward(int distance) {
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    //печатаем координаты робота после движения
    public void printCoordinates() {
        System.out.println("Coordinates: x =" + x + ", y =" + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}
