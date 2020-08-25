import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

//Function: It is a functional interface.

public class JavaEightPrg2 {

    public static void main(String[] args) {

       // Function interface
        Function<String,Integer> f=a->a.length();
        Function<Integer,Integer> f1=a->a*10;
        Integer i=f.andThen(f1).apply("India");
        System.out.println(i);

        //BiFunction
        BiFunction<Integer,Integer,Integer> f2=(a,b)->a+b;
        Integer i1=f2.apply(10,20);
        System.out.println(i1);

        //BinaryOperator
        BinaryOperator<Integer> f3=(a,b)->a+b;
        Integer i3=f3.apply(30,40);
        System.out.println(i3);

        //UnaryOperator
        UnaryOperator<Integer> f4=a->a*10;
        Integer i4=f4.apply(50);
        System.out.println(i4);

        //Predicate
        Predicate<Integer> p=a->a>10;
        List<Integer> list= Arrays.asList(10,5,15,20,30,25);
        List<Integer> list1=list.stream().filter(p).collect(Collectors.toList());
        System.out.println(list1);

        //BiPredicate
        BiPredicate<String,Integer> bi=(a,b)->{
            boolean flag=a.length()==b;
            return flag;
        };

        boolean check=bi.test("Abhi",5);
        System.out.println(check);

        //Consumer
        Consumer<Integer> c=a-> System.out.println(a);
        c.accept(25);

        //BiConsumer
        BiConsumer<Integer,Integer> bic=(a,b)-> System.out.println(a+b);
        bic.accept(25,40);

    }
}
