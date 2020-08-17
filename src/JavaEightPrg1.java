import java.util.Arrays;
import java.util.List;

public class JavaEightPrg1 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,15,20);
        // Normal Java
//        for (Integer i:list) {
//            System.out.println(i);
//        }

        //Java 8, lambda expression
      //  list.forEach(a-> System.out.println(a));

        //method reference  - double colon(::)
        list.forEach(System.out::println);
    }
}
