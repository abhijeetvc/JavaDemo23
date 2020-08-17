public class ThrowExceptionPrg {

    void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Age is less than 18!!!");
        }else{
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        ThrowExceptionPrg t=new ThrowExceptionPrg();
        try {
            t.checkAge(15);
        }catch(Exception e){
            System.out.println("Invalid Age");
        }
        System.out.println("Hiiiiiiiiii");
    }
}
