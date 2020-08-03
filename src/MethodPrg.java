//Method: It defines the behaviour
// Method has : access specifier, return type, method name, may or may not have parameters, body

public class MethodPrg {

    void display(){
        System.out.println("In display method");
        System.out.println(getData());
    }

    private String getData(){
       // System.out.println("Hellloooooo");
        return "Hello Java";
    }

    private int addNos(int a,int b){
        int total=a+b;
        return total;
    }
    public static void main(String[] args) {
        MethodPrg m=new MethodPrg();
        m.display();
       // String str=m.getData();

        int result=m.addNos(10,20);
        System.out.println(result);
    }
}
