public class CarMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Car car = Car.builder()
                    .setColor(" red " + i)
                    .setType(" vm " + i) //setAge(String.valueOf(i)
                    .build();
            System.out.println(car);
        }
    }
}
