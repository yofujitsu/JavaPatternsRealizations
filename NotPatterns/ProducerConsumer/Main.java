package NotPatterns.ProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int maxItems;

    public Producer(BlockingQueue<Integer> queue, int maxItems) {
        this.queue = queue;
        this.maxItems = maxItems;
    }

    public void run() {
        try {
            for (int i = 1; i <= maxItems; i++) {
                queue.put(i);
                System.out.println("Producer produced: " + i);
                Thread.sleep(1000); // Имитация производства элемента
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int item = queue.take();
                System.out.println("Consumer consumed: " + item);
                Thread.sleep(2000); // Имитация обработки элемента
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10); // Очередь фиксированного размера

        Producer producer = new Producer(queue, 5);
        Consumer consumer = new Consumer(queue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}