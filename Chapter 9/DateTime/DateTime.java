import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
    public static void main(String[] args) {
        //получаем текущую дату
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата : " + today);

        //Создадим LocalDate и в качестве аргументов
        //укажем год месяц и день
        LocalDate specificDate = LocalDate.of(2017, Month.NOVEMBER, 30);
        System.out.println("Дата с указанием года, месяца и дня : " + specificDate);
        System.out.println();
        localTime();
        System.out.println();
        localDateTime();
    }

    public static void localTime() {
        //получаем текущее время
        LocalTime time = LocalTime.now();
        System.out.println("Получаем текущее время : " + time);

    }


    public static void localDateTime() {//для работы как с датой и временем
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime plusDays = localDateTime.plusDays(7).plusYears(2).plusHours(1);
        System.out.println("Получаем текущее время и дату: " + localDateTime);
        System.out.println("Получаем текущее время и дату+7 дней: " + plusDays);

        LocalDateTime specificTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Текущая дата : " + specificTime);

    }
}
