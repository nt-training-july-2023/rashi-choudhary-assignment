package ThreadTask;
//Create a program where Threads are reading a message and giving acknowlegement (what a particular thread is reading);
public class ThreadMessage {
    public static void main(String []args){
        Thread th1=new DisplayMessage("Thread1");
        Thread th2=new DisplayMessage("Thread2");
        Thread th3=new DisplayMessage("Thread3");

        th1.setPriority(1);
        th2.setPriority(5);
        th3.setPriority(10);

        th1.start();
        th2.start();
        th3.start();
    }

}
class DisplayMessage extends Thread{
    public DisplayMessage(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is reading the run method of DisplayMessage class ");
    }
}
