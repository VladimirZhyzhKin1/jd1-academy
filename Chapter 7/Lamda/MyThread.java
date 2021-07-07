import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyThread implements Callable<String> {//колабл что-то возвращает, тип данных указанный <>

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //возвращает имя потока, который выполняет callable таск
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<>();  //параметаризированный инфейст, который возвращает данные Стрингом
        Callable<String> callable = new MyThread();
        for (int i = 0; i < 100; i++) {
            //сабмитим Callable таски, которые
            //будут выполнены пулом потоков
            Future<String> future = executor.submit(callable);
            //добавляя Future в список,
            //мы сможем получить результат выполнения
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                //печатаем в консоль возвращенное значение Future
                //будет задержка в секунду, потомучто Future . get()
                //ждет пока таск закончит выполнение
                System.out.println(new Date() + "::" + fut.get());//ассинхронный вызов
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
