//Member Inner class

public class InnerClassDemo {

    private String name="Peter";

    class InnerDemo{
        void display(){
            System.out.println("Name is: "+name);
        }
    }

    public static void main(String[] args) {
        InnerClassDemo icd=new InnerClassDemo();
        InnerClassDemo.InnerDemo id=icd.new InnerDemo();
        id.display();
    }
}
