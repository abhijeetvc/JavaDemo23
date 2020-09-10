// c) Method Reference to an instance method of arbitrary objects of particular type

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReference3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("India");
        list.add("US");
        list.add("France");
        list.add("Germany");

        Collections.sort(list,String::compareToIgnoreCase);
        list.forEach(System.out::println);
    }
}
