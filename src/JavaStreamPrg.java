import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamPrg {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,5,20,15,25,30,45);

        List<Integer> list1=list.stream().filter(a->a>10).collect(Collectors.toList());
        System.out.println(list1);
    }
}
