public class MyThread extends Thread {//первый способ создания потокаунаследование от

    @Override
    public void run() {
        System.out.println("Hello from a thread!" + getName() + " " + getId() + " " + getPriority());
        super.run();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            new MyThread().start();
        }
    }
}
