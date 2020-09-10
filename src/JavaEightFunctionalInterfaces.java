import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class JavaEightFunctionalInterfaces {

    public static void main(String[] args) {

        Function<String,Integer> f=a->a.length();
        Integer i=f.apply("Abhijeet");
        System.out.println(i);

        BiFunction<Integer,Integer,Integer> f1=(a,b)->a+b;
        Integer i1=f1.apply(10,20);
        System.out.println(i1);

        BinaryOperator<Integer> f2=(a,b)->a+b;
        Integer i3=f2.apply(30,40);
        System.out.println(i3);

        UnaryOperator<Integer> f3=a->a*10;
        Integer i4=f3.apply(5);
        System.out.println(i4);

        Function<String,Integer> f4=a->a.length();
        Function<Integer,Integer> f5=a->a*100;
        Integer i5=f4.andThen(f5).apply("Abhi");
        System.out.println(i5);

        //Predicate
        //BiPredicate
        //Consumer
        //BiConsumer
    }
}
