public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("My Runnable from a thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {//для setPriority максим приор 10 минимальный 1
            System.out.println("Start thread " + i);
            Thread thread = new Thread(new MyRunnable());
            thread.setPriority(i);// этот метод означает, что данный поток чаще и пристальнее будет обрабатываться JVM
            thread.setDaemon(true);//то что если закончиться выполнение main есл
            thread.start();
            System.out.println("Finish start thread " + i);
        }
    }
}

