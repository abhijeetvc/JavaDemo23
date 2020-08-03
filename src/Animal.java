//Inheritance: Useful for code re-usability
// It is also called as 'is-a'
//
public class Animal {

    public void eat(){
        System.out.println("All animals eat");
    }

    public void run(){
        System.out.println("All animals run");
    }
}
class Dog extends Animal{

    void bark(){
        System.out.println("All dogs bark");
    }

//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.eat();
//        d.run();
//        d.bark();
//    }
}
//class Puppy extends Dog{
//
//    void bark1(){
//        System.out.println("puppy shouts very much");
//    }
//
//    public static void main(String[] args) {
//        Puppy p=new Puppy();
//        p.run();
//        p.eat();
//        p.bark1();
//        p.bark();
//    }
//}

class Cat extends Animal{

    void run1(){
        System.out.println("Cat runs fast");
    }


}
