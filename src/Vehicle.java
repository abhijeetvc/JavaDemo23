//class : Logical unit
//object : instance of class
// object has : state and behaviour
// state - fields
// behaviour - methods

public class Vehicle {

    //instance variable
    String color="black";  // state or field

    void run(){
        System.out.println("All cars run at top speed");
    }

    void start(){
        System.out.println("All cars start with keys");
    }

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.run();
        v.start();
    }
}
