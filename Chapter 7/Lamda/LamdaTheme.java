import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LamdaTheme {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> System.out.println("my thread ");
            executor.execute(runnable);
        }
        executor.shutdown();
    }
}
