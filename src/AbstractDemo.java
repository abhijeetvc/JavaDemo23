//Abstract class is incomplete class

abstract class Animal1{

    abstract void eat();   //incomplete method
}

public class AbstractDemo extends Animal1 {

    public static void main(String[] args) {
        AbstractDemo a=new AbstractDemo();
        a.eat();
    }

    @Override
    void eat() {
        System.out.println("in eat method");
    }
}