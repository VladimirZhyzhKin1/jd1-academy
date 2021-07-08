
public class ClassWork {
    /* StringBuffer append // массив char ов ,который создает объект а с помощью
     append массив char ов, которые добавляем
     ""
     System.out.println(append.toString())
     */
    public static void main(String[] args) {
        StringBuffer sec = new StringBuffer();
        int second = 14;
        int minute = 14;
        int hour = 14;
        StringBuffer append = sec.append(second)
                .append(textGetSecond(second))
                .append(minute)
                .append(textGetMinute(minute))
                .append(hour)
                .append(textGetHour(hour));
        System.out.println(append.toString());
        /*через .append в экземпляре класса вношу новые данные-при
        этом расширяю его, а при помощи toString() переношу объединенное значение в String pool,
        где хранятся все значения  класска String в массиве final char*/

        System.out.println();

        StringBuilder dar = new StringBuilder();
        StringBuilder append2 = dar.append(second)
                .append(textGetSecond(second))
                .append(minute)
                .append(textGetMinute(minute))
                .append(hour)
                .append(textGetHour(hour));
        System.out.println(append2.toString());

        System.out.println("74657839".matches("-?[0-9]+"));// - начало строки, + конец строки
    }

    public static String textGetHour(int hour) {
        if (hour % 10 == 1) {
            return " час ";
        } else if (hour % 10 == 2 || hour % 10 == 3 || hour % 10 == 4) {
            return " часа ";
        } else return " часов ";
    }

    public static String textGetMinute(int minute) {
        if (minute % 10 == 1) {
            return " минута ";
        } else if (minute % 10 == 2 || minute % 10 == 3 || minute % 10 == 4) {
            return " минуты ";
        } else return " минут ";
    }

    public static String textGetSecond(int second) {
        if (second % 10 == 1) {
            return " секунда ";
        } else if (second % 10 == 2 || second % 10 == 3 || second % 10 == 4) {
            return " секунды ";
        } else return " секунд ";
    }


}

