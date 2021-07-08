package AccountTest;// у ввсех классов есть монитор, это значит что все классы можно Синхронайзить в методах

public class MyAccountThread extends Thread {
    private Account account;

    public MyAccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000_000; i++) {
            account.increase();
        }
    }

    public static void main(String[] args) {
        Account account = new Account(10);
        Thread thread = new MyAccountThread(account);
        thread.start();
        for (int i = 0; i < 1_000_000; i++) {
            account.decrease();
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account);
    }
}
