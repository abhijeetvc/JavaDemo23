public class RunnableInterfacePrg {

    public static void main(String[] args) {

        System.out.println("111111111" + Thread.currentThread().getName());
        Runnable r =()-> {

                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Thread t=new Thread(r);
        t.start();
       // RunnableInterfacePrg runnableInterfacePrg=new RunnableInterfacePrg();

    }
}

//    @Override
//    public void run() {
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

