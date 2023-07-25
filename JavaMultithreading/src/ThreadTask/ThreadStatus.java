package ThreadTask;
//Create a Program to print each state of a thread(from creation to termination);
public class ThreadStatus {
    public static void main(String []args) throws InterruptedException {

    Thread th1=new Execute();
    th1.setName("Thread1");
     System.out.println(th1.getName()+" : "+th1.getState());
     Thread th2=new  Execute();
     th2.setName("Thread2");
     System.out.println(th2.getName()+" : "+th2.getState());
     Thread th3=new  Execute();
     th3.setName("Thread3");
     System.out.println(th3.getName()+" : "+th3.getState());
     th1.start();
     th1.join();
        System.out.println(th1.getName()+" : "+th1.getState());
     th2.start();
     th3.start();
     System.out.println(th1.getName()+" : "+th1.getState());
     System.out.println(th3.getName()+" : "+th3.getState());
     System.out.println(th2.getName()+" : "+th2.getState());

}
    }

class Execute extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getState());
        try {
            System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getState());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.currentThread().join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
