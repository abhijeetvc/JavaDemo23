// Variables: Storage area in memory
// Types of Variables: a) Instance Variables, b) static/class variables, c) local variables, d) parameters
// Data Types: Primitive Types: int, float, double, boolean, char, byte, short, long
import java.util.Scanner;

public class HelloWorld {

    int a=1235678987;  //Instance variable

    long l=123456678890866l;
    float PI=3.14f;
    public static void main(String[] args) {
        int b=30;  //Local Variable
        HelloWorld h=new HelloWorld();  //Object is an instance of class
        System.out.println(h.a);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input=sc.nextInt();
        System.out.println("Input value is: "+input);
    }
}
