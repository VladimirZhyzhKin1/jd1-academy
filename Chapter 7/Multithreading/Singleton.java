
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {//один единственный класс для всех потоков, если без синхронайз-то не для всех
        if (instance == null){
            instance=new Singleton();
        }
        return instance;
    }
    //volatile -> посмотреть примеры в интернете
}
