package NotPatterns.MyRunnable;

class MyRunnable implements Runnable {
    @Override
    public synchronized void run() {
        for(int i = 0; i < 100; ++i) {
            if(i%10 ==0) System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
