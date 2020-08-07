package demo2;


import demo1.Demo3;
import demo1.Person1;

public class MainCheck1 extends Demo3{

    public static void main(String[] args) {
        Person1 p=new Person1();
        p.setId(1);
        p.setName("A");
        p.setCity("Pune");

        System.out.println("Id is: "+p.getId());
        System.out.println("Name is: "+p.getName());
        System.out.println("City is: "+p.getCity());

        MainCheck1 m=new MainCheck1();
        System.out.println(m.a);

    }
}
