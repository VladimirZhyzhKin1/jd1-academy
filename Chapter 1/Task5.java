/*Задание 5
Задать промежуток времени в секундах в виде переменной.
 Следует вывести его на экран в виде часов минут и секунд, суток и недель.
* */
public class Task5 {
    private int s;
    //так как есть у нас постоянные значения, имеет смысл их сделать константами
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60;
    private static final int SECONDS_PER_DAY = SECONDS_PER_HOUR * 24;
    private static final int SECONDS_PER_WEEK = SECONDS_PER_DAY * 7;

    public Task5(int s) {
        this.s = s;
    }

    public void timeInterval() {
        int weeks = s / SECONDS_PER_WEEK;
        int days = (s - weeks * SECONDS_PER_WEEK) / SECONDS_PER_DAY;
        int hours = (s - weeks * SECONDS_PER_WEEK - days * SECONDS_PER_DAY) / SECONDS_PER_HOUR;
        int minutes = (s - weeks * SECONDS_PER_WEEK - days * SECONDS_PER_DAY - hours * SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
        int seconds = (s - weeks * SECONDS_PER_WEEK - days * SECONDS_PER_DAY - hours * SECONDS_PER_HOUR - minutes * SECONDS_PER_MINUTE);
        System.out.println("the entered number is " + s);
        System.out.println(weeks + " weeks " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }

    public static void main(String[] args) {
        Task5 timeInterval = new Task5(21536000);
        timeInterval.timeInterval();
    }
}
