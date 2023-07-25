package ThreadTask;

public class ExploreThread {
    public static void main(String[]args){
        ThreadDemo th1=new ThreadDemo();
        ThreadDemo th2=new ThreadDemo();
        // setName("") :It changes the name of the thread.
        th1.setName("Thread1");
        th2.setName("Thread2");
        // setPriority(int) :It changes the priority of the thread.
        th1.setPriority(10);
        th2.setPriority(5);
        //getPriority :It returns the priority of the thread.
        System.out.println(th1.getName()+" has priority "+th1.getPriority()+" and has Id "+th1.threadId());
        System.out.println(th2.getName()+" has priority "+th2.getPriority()+" and has Id "+th2.threadId());
        // start() :It is used to start the execution of the thread.
        th1.start();
        th2.start();
        // join():It waits for a thread to die.
        try {
            th1.join();
            // getState(): It is used to return the state of the thread.
            System.out.println("State of th1 thread :"+th1.getState());
            // isAlive() :It tests if the thread is alive.
          if(!th1.isAlive())
              System.out.println("The thread th1 is currently not alive");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class ThreadDemo extends Thread{
    @Override
    public void run() {
        // sleep(): It sleeps a thread for the specified amount of time.

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Thread.currentThread(): It returns a reference to the currently executing thread object.
        // getName() : It returns the name of the thread.
        System.out.println(Thread.currentThread().getName()+" Is executing ThreadDemo class");

    }
}
