public class LocalInnerClass {

    private int x=20;

    void check(){

        class LocalDemo{
            void getData(){
                System.out.println("Value of x: "+x);
            }
        }

        LocalDemo ld=new LocalDemo();
        ld.getData();
    }

    public static void main(String[] args) {
        LocalInnerClass lc=new LocalInnerClass();
        lc.check();


    }
}
