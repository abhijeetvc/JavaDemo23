// int  ,  byte , short, long, double , float, boolean, char
// Integer, Byte, Short, Long, Double, Float, Boolean, Character

public class WrapperClassPrg {

    public static void main(String[] args) {
        String str="12345.50";

//        Integer i=Integer.parseInt(str);
//////        System.out.println(i);

        Double d=Double.parseDouble(str);
        System.out.println(d);

        //Autoboxing - conversion of primitive to wrapper object
        int a=70;
        Integer x=a;

        //Unboxing - conversion of wrapper object to primitive type
        Integer a1=75;
        int x1=a1;



    }
}
