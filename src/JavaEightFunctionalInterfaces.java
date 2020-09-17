import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

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
        List<Integer> list= Arrays.asList(5,15,10,25,20,30,35);

        List<Integer> list1=list.stream().filter(a->a>10).collect(Collectors.toList());
        System.out.println(list1);

        //BiPredicate
        BiPredicate<String,Integer> bif=(a,b)->{
            return a.length()==b;
        };
        Boolean b=bif.test("Abhijeet",7);
        System.out.println(b);

        //Consumer
        Consumer<String> display=a-> System.out.println(a);
        display.accept("Abhi");

        //BiConsumer
        BiConsumer<Integer,Integer> bic=(a,b1)-> System.out.println(a+b1);
        bic.accept(10,20);
        
        //Multithreading with one framework i.e Executors
        //FileHandling
    }
}
