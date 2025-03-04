class PriorityDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        PriorityDemo demo = new PriorityDemo();

        Thread thread1 = new Thread(demo, "Thread 1");
        Thread thread2 = new Thread(demo, "Thread 2");

        // Set priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
