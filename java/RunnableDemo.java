// class MyThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Child Thread: " + i);
//             try {
//                 Thread.sleep(500); // pause for 500 ms
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class MultithreadingDemo {
//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start(); // starts new thread

//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Main Thread: " + i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// 2 method


class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
