import java.time.LocalDate;

public class Month {
    public static void main(String[] args) {
        //получаем текущую дату
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата : " + today);

        //Создадим LocalDate и в качестве аргументов
        //укажем год месяц и день
        LocalDate specificDate = LocalDate.of(2017, java.time.Month.NOVEMBER, 30);
    }
}
