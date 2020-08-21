import java.util.function.Function;

//Function: It is a functional interface.

public class JavaEightPrg2 {

    public static void main(String[] args) {
        Function<String,Integer> f=a->a.length();
        Function<Integer,Integer> f1=a->a*10;
        Integer i=f.andThen(f1).apply("India");
        System.out.println(i);
    }
}
