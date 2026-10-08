class TaskOne implements Runnable {
    public void run() {
        System.out.println("Task one running");
    }
}

class TaskTwo implements Runnable {
    public void run() {
        System.out.println("Task two running");
    }
}

public class RunnableThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskOne());
        Thread t2 = new Thread(new TaskTwo());
        t1.start();
        t2.start();
    }
}
