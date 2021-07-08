public class MyThread1 {
    public static void main(String[] args) throws Throwable {
        Thread worker = new WorkerThread();
        Thread sleeper = new SleepThread();
        System.out.println("Starting thread");
        worker.start();
        sleeper.start();
        Thread.sleep(1000L);

        System.out.println();
        System.out.println("Interrupt thread");
        worker.interrupt();
        sleeper.interrupt();

        System.out.println();
        System.out.println("Join");
        worker.join();
        sleeper.join();

        System.out.println();
        System.out.println("Finish");
    }


    private static class WorkerThread extends Thread {
        @Override
        public void run() {
            long sum = 0;
            for (int i = 0; i < 1_000_000_000; i++) {
                sum += i;
                if (i % 100 == 00 && isInterrupted()) {
                    System.out.println("Hello " + sum);
                    break;
                }
            }
        }
    }

    private static class SleepThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }
}


