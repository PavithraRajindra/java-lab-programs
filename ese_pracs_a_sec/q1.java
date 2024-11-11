package ese_pracs_a_sec;

public class q1 {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        q1 example = new q1();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.increment();
                System.out.println("Thread 1: "+example.getCounter());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.increment();
                System.out.println("Thread 2: "+example.getCounter());
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final Counter: " + example.getCounter());
    }
}
