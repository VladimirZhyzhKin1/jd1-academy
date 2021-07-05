package FIFO;

public class QueueTest {
    public static void main(String[] args) {
        ObjectQueue queue = new ObjectQueue();

        for (int i = 0; i < 10; i++) {
            //в данном случае мы складываем в очередь строки
            queue.push("Строка: " + i);
        }

        System.out.println("Index = " + queue.get(2));

        while (queue.size() > 0) {
            //мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
            String s = (String) queue.pull();
            System.out.println(s);
            System.out.println("Размер очереди: " + queue.size());
            System.out.println();
        }
    }
}
