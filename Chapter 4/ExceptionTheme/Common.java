package Exception;

public class Common {
    public static void main(String[] args) {
        try {
            int[] mass = new int[5];
            mass[6] = 6;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Всегда выполняем этот код: ");
        }
    }
}
