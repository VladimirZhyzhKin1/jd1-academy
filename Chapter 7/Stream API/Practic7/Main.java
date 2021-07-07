package Practic7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream API
public class Main {

    // TODO: 2/30/2021
    //  1) Вывести 11 четных чисел начиная с 2.
    //  2) проверить список пользователей, всем ли больше 18.
    //  3) достать пятый элемент колекции или вернуть "null".
    //  4) достать 7 самых больших чисел из массива чисел.
    //  5) выбрать всех работоспособных людей (учитывая пол и возраст для работы). Вернуть количество.
    //  6) получить средний возраст для мужчин.
    //  7) Есть журнал посещения сайта, нужно выбрать уникальных пользователей - женщие старше 28,
    //  становить флажок "winner" в true и представить результат в виде карты phone - name.

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task7() {
        System.out.println("--Task7--");
        Random random = new Random();
        System.out.println("use Cycle:");
        List<User> users = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            users.add(new User(random.nextInt(20), i * random.nextInt(1000), "user" + i, random.nextInt(120),
                    random.nextInt(10) % 2 == 1 ? Sex.FEMALE : Sex.MALE));
        }

        Map<Integer, String> map1 = new HashMap<>();
        Set<User> set = new HashSet<>(users);

        for (User user : set) {
            if (user.getSex().equals(Sex.FEMALE) && user.getAge() > 28) {
                user.setWinner(true);
                map1.put(user.getPhone(), user.getName());
            }
        }
        System.out.println(map1.size());

        System.out.println("use Stream:");
        Map<Integer, String> map2 = users.stream().distinct().filter(user -> user.getSex().equals(Sex.FEMALE) && user.getAge() > 28)
                .peek(user -> user.setWinner(true)).collect(Collectors.toMap(User::getPhone, User::getName));
        System.out.println(map2.size());
        System.out.println();
    }

    private static void task6() {
        System.out.println("--Task6--");
        Random random = new Random();
        System.out.println("use Cycle:");
        List<User> users = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            users.add(new User(i, i * random.nextInt(1000), "user" + i, random.nextInt(120),
                    random.nextInt(10) % 2 == 1 ? Sex.FEMALE : Sex.MALE));
        }

        int size = 0;
        double sum = 0;
        for (User user : users) {
            if (user.getSex().equals(Sex.MALE)) {
                sum += user.getAge();
                size++;
            }
        }
        System.out.println("Средний возраст мужчин = " + sum / size);

        System.out.println("use Stream:");
        //результат фильтровки мы переведем в инты и у стримов есть метод который возвращает среднее значение
        System.out.println(users.stream().filter(user -> user.getSex().equals(Sex.MALE)).mapToInt(User::getAge).average().orElse(0));
        System.out.println();
    }

    private static void task5() {
        System.out.println("--Task5--");
        Random random = new Random();
        System.out.println("use Cycle:");
        List<User> users = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            users.add(new User(i, i * random.nextInt(1000), "user" + i, random.nextInt(120),
                    random.nextInt(10) % 2 == 1 ? Sex.FEMALE : Sex.MALE));
        }
        int count = 0;
        for (User user : users) {
            if (user.getSex().equals(Sex.FEMALE) && user.getAge() >= 18 && user.getAge() < 60 ||
                    user.getSex().equals(Sex.MALE) && user.getAge() >= 18 && user.getAge() < 65) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("use Stream:");
        System.out.println(users.stream().filter(user -> user.getSex().equals(Sex.FEMALE)
                && user.getAge() >= 18 && user.getAge() < 60 ||
                user.getSex().equals(Sex.MALE) && user.getAge() >= 18 && user.getAge() < 65).count());
        System.out.println();
    }

    private static void task4() {
        System.out.println("--Task4--");
        System.out.println("use Cycle:");
        Random random = new Random();

        Integer[] array = new Integer[40];
        for (int i = 0; i < 40; i++) {
            array[i] = random.nextInt(10000);
        }
        Arrays.sort(array, Comparator.reverseOrder());
        for (int i = 0; i < 7; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        System.out.println("use Stream:");
        System.out.println(Arrays.stream(array).sorted(Comparator.reverseOrder()).limit(7).collect(Collectors.toList()));
        System.out.println();
    }

    private static void task3() {
        System.out.println("--Task3--");
        Random random = new Random();
        System.out.println("use Cycle:");
        List<User> users = new ArrayList<>(1000);
        for (int i = 0; i < 3; i++) {
            users.add(new User(i, i * random.nextInt(1000), "user" + i, 17 + random.nextInt(120),
                    random.nextInt(10) % 2 == 1 ? Sex.FEMALE : Sex.MALE));
        }
        if (users.size() > 5) {
            System.out.println(users.get(5));
        } else {
            System.out.println("null");
        }

        System.out.println("use Stream:");
        System.out.println(users.stream().skip(5).findFirst().orElse(null));
        System.out.println();
    }

    private static void task2() {
        System.out.println("--Task2--");
        //Task2 нужно сождать этот список пользователей
        Random random = new Random();
        System.out.println("use Cycle:");
        List<User> users = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            users.add(new User(i, i * random.nextInt(1000), "user" + i, 17 + random.nextInt(120),
                    random.nextInt(10) % 2 == 1 ? Sex.FEMALE : Sex.MALE));
        }
        //создаем флажок
        boolean correct = true;
        for (User user : users) {
            if (user.getAge() < 18) {
                correct = false;
                break;
            }
        }

        System.out.println(correct);
        System.out.println("use Stream:");
        //в allMatch() берем каждого из user
        System.out.println(users.stream().allMatch(u -> u.getAge() >= 18));//и если условие будет верное, то вернет true
        System.out.println();
    }

    private static void task1() {
        System.out.println("--Task1--");
        System.out.println("cycle 'for' resoults ");
        for (int i = 2; i < 23; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Stream resoults ");
        System.out.println(Stream.iterate(2, n -> n += 2).limit(11).collect(Collectors.toList()));//задаем начальное выражение (начинаем с 2),
        // затем нужно выполнить условие (11 четных чисел) и создаем лимит на эти 11 значений,
        // затем нужно наши выражения преобразовать при помощи collect() и выведем в виде листа при помощи
        System.out.println();
    }

}
