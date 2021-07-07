import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);//применяется интерфейс экзекютер, если у нас ресурсы ограничены
        for (int i = 0; i < 100; i++) {
            executor.execute(new Runnable() {// экзекутор автоматически передает ранэйбл десетью потокам,т.е. запускает все 10 потоков и работает как очередь
                @Override
                public void run() {
                    System.out.println("my thread " + Thread.currentThread().getName());//дает нам текущий поток для запуска
                }
            });
        }
        executor.shutdown();//в данном случае мы должны стопить каждый поток
    }
}
//ctrl+f12 - поисковик в библиотеке
