// Multithreading:
// Process: A program that is under execution.
// A process can have multiple threads

public class MultithreadPrg extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultithreadPrg m=new MultithreadPrg();
        System.out.println("1111111"+Thread.currentThread().getName());
        m.start();
        System.out.println("2222222"+Thread.currentThread().getName());
    }
}
