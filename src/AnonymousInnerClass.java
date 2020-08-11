//Anonymous class: Class that doesn't have name.

abstract class CheckDemo{

    abstract void display();
}

interface DemoInterface{
    void display1();
}
public class AnonymousInnerClass {

    void check(){
        System.out.println("In check method");
    }
    public static void main(String[] args) {
        AnonymousInnerClass a=new AnonymousInnerClass();
        a.check();

        CheckDemo cd= new CheckDemo() {
            @Override
            void display() {
                System.out.println("In display method");
            }
        };

        cd.display();

        DemoInterface di=new DemoInterface() {
            @Override
            public void display1() {
                System.out.println("In display1 method");
            }
        };
        di.display1();
    }
}
