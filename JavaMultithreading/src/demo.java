public class demo {
    public static void main(String[]args){
        Thread1 th1=new Thread1();
        Thread2 th2=new Thread2();
//        th1.start();
//
//        th2.start();
        th1.setPriority(1);
        th2.setPriority(5);
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());


    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (true){
            System.out.println("welcome");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good morning");
        }
    }
}
