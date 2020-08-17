//Type casting : 2 types
// a) Widening type casting  / Implicit type casting
// b) Narrowing type casting  / Explicit type casting

public class TypeCastingPrg {

    public static void main(String[] args) {
        int x=75;
        System.out.println(x);

        double d=x;
        System.out.println(d);


        double d1=78.55;
        System.out.println(d1);

        int x1= (int) d1;
        System.out.println(x1);
    }
}
