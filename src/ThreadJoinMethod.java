// Executors Framework - Multithreading


public class ThreadJoinMethod extends Thread {

    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinMethod th=new ThreadJoinMethod();
        ThreadJoinMethod th1=new ThreadJoinMethod();
        th.start();
        th.join(500);
        th1.start();
    }
}
