
class Demo{

    public synchronized void display(int a) throws InterruptedException {
        for (int i=1;i<=5;i++){
            System.out.println(i*a);
            Thread.sleep(1000);

        }
    }
}

class Check1 extends Thread{

    Demo demo;

    public Check1(Demo demo){
        this.demo=demo;
    }

    public void run(){
        try {
            demo.display(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Check2 extends Thread{
    Demo demo;
    public Check2(Demo demo){
        this.demo=demo;
    }

    public void run(){
        try {
            demo.display(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class MultuthreadSyncPrg {

    public static void main(String[] args) {
        Demo d=new Demo();
        Check1 c1=new Check1(d);
        c1.start();
        Check2 c2=new Check2(d);
        c2.start();
    }

}
