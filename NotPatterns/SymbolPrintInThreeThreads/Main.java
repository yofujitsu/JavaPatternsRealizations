package NotPatterns.SymbolPrintInThreeThreads;

class MyThread extends Thread {
    private StringBuilder sharedStringBuilder;

    public MyThread(StringBuilder sharedStringBuilder) {
        this.sharedStringBuilder = sharedStringBuilder;
    }

    @Override
    public void run() {
        synchronized (sharedStringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(sharedStringBuilder);
                sharedStringBuilder.setCharAt(0, (char) (sharedStringBuilder.charAt(0) + 1));
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StringBuilder sharedStringBuilder = new StringBuilder("a");

        MyThread thread1 = new MyThread(sharedStringBuilder);
        MyThread thread2 = new MyThread(sharedStringBuilder);
        MyThread thread3 = new MyThread(sharedStringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
