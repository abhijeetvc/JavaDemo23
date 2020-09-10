@FunctionalInterface
interface MyInterface{
    MethodReference4 getData(String s);
}

public class MethodReference4 {

    public MethodReference4(String str){
        System.out.println("String is: "+str);
    }

    public static void main(String[] args) {
        MyInterface m=MethodReference4::new;
        m.getData("India");
    }
}
