public class MethodOverloadDemo {

    int add(){
        int a=10;
        int b=20;
        int result=a+b;
        return result;
    }

    int add(int a, int b){
        int result=a+b;
        return result;
    }

    public static void main(String[] args) {
        MethodOverloadDemo m=new MethodOverloadDemo();
        System.out.println(m.add());
        System.out.println(m.add(30,40));
    }
}
