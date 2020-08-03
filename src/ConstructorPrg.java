//Constructor: Special type of method.
// Constructor has: access specifier, name same as class name, may or may not have parameters, body
public class ConstructorPrg {

    int a,b;  // instance variable
    int result=0;

    public ConstructorPrg(){  //No argument constructor

        System.out.println("In constructor");
    }

    public ConstructorPrg(int a,int b){
        this.a=a;  //this: It is keyword in java. "this" refers to current object.
        this.b=b;
      //  a=a1;
    }

    void addNos(){
        result=a+b;
        System.out.println(result);
    }

    void sub(){
        result=a-b;
        System.out.println(result);
    }

    void showdata(){

        System.out.println("Value of a: "+a);
    }

    void display1(){

        showdata();
    }
    public static void main(String[] args) {
    //    ConstructorPrg c=new ConstructorPrg();
        ConstructorPrg c1=new ConstructorPrg(10,30);
        c1.showdata();
        c1.addNos();
        c1.sub();
    }
}
