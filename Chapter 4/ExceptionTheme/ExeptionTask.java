package Exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExeptionTask {
    private static final Logger logger =
            Logger.getLogger(ExeptionTask.class.getName());

    public static final int COUNT = 5;

    public static void main(String[] args) {
        int[] array = new int[COUNT];
        int index = 6;
        int value = 6;
        test(array, index, value);
        test(array, index - 1, value);
        test(array, index - 2, value);
    }

    private static void test(int[] array, int index, int value) {
        try {
            logger.log(Level.INFO, "start");
            setElement(array, index, value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
            logger.log(Level.WARNING, "IndexOutOfBoundsException");
        } catch (Error e) {
            System.out.println("Error");
            logger.log(Level.WARNING, "Error");
        }
    }

    private static void setElement(int[] array, int index, int value) {
        array[index] = value;
        throw new Error();
    }
}
//как нам вынести все в метод -> контс+алт+М. Выделяю кусок кода и нажимаю эту связку
// контр+алт+Р занесение в параметр
// контр+алт+С - вынесение в константу
//контр+алт+V - вынесение в значение
//контр+алт+F - переменная класса
//контр+W выделяет всю строчку

