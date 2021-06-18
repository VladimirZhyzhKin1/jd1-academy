import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Это твое расписание на неделю.");
        System.out.println("Пожалуйста введи день недели, чтобы посмотреть свои планы на этот день:");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        check(day);
    }

    public static void check(int day) {
        switch (day) {
            case 1:
                System.out.println("День 1: Посещаю рок-концерт группы Blindguardian");
                break;
            case 2:
                System.out.println("День 2: Путешествую по Испании");
                break;
            case 3:
                System.out.println("День 3: Встреча с голивудским актером Киану Ривзом");
                break;
            case 4:
                System.out.println("День 4: Посещение бассейна");
                break;
            case 5:
                System.out.println("День 5: Поездка на мотоцикле по Кипру");
                break;
            case 6:
                System.out.println("День 6: Плавание на яхте в Адриатическом море");
                break;
            case 7:
                System.out.println("День 7: Медитация в Шаолинском монастыре");
                break;
            default:
                System.out.println("Нет такого дня недели, попробуйте ввести день заново...");
        }

    }
}




















        /*int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 3);
        }
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.println("Число " + element + " является четным ");
            } else {
                System.out.println("Число " + element + " является нечетным");
            }

        }
    }*/

    /*public static void initializationDay() {

        String[] weekDay = new String[7];
        weekDay[0] = "День 1: Посещаю рок-концерт группы Blindguardian";
        weekDay[1] = "День 2: Путешествую по Испании";
        weekDay[2] = "День 3: Встреча с голивудским актером Киану Ривзом";
        weekDay[3] = "День 4: Посещение баннооздоровительного комплекса";
        weekDay[4] = "День 5: Поездка на мотоцикле по Кипру";
        weekDay[5] = "День 6: Плавание на яхте в Адриатическом море";
        weekDay[6] = "День 7: Медитация в Шаолинском монастыре";

        for (int i = 0; i < weekDay.length; i++) {
            System.out.println(weekDay[i] + " ");
        }*/





