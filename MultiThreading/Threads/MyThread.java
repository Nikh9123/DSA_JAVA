package MultiThreading.Threads;

// A thread has 5 steps in its life cycle they are:
// 1. New: The thread is created but not yet started.
// 2. Runnable: The thread is ready to run and waiting for CPU time.
// 3. Running: The thread is executing its task.
// 4. Blocked/Waiting: The thread is paused and waiting for a resource or signal.
// 5. Terminated: The thread has completed its execution.

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println(t1.isAlive() + " " + t1.isInterrupted());
        t1.start();
        System.out.println(t1.getId() + " " + t1.getName() + " " + t1.getPriority() + " " + t1.isAlive());
        
        /*
        t1.start();
        The start() method is used to start the execution of a thread. It internally calls the run() method.

        t1.isAlive(); // This method is used to check whether the thread is alive or not.

        t1.getName(); // This method is used to get the name of the thread.

        t1.setName("MyThread"); // This method is used to set the name of the thread.

        t1.getPriority(); // This method is used to get the priority of the thread.

        t1.setPriority(10); // This method is used to set the priority of the thread.

        t1.getId(); // This method is used to get the id of the thread.

        t1.interrupt(); // This method is used to interrupt the thread.

        t1.isInterrupted(); // This method is used to check whether the thread is interrupted or not.

         */
        
    }
}
