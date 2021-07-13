//Паттерн Builder
public class Car {
    private String color;
    private String type;

    private Car() {
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class CarBuilder {//это вложенный private класс, который нам собирает основные данные по Car
        private String color;
        private String type;

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.setColor(color);
            car.setType(type);
            return car;
        }
    }

    static CarBuilder builder() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return getColor() + " " + getType();
    }
}
