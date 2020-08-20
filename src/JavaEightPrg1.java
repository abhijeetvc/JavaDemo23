import java.util.*;

public class JavaEightPrg1 {

    public static void main(String[] args) {
     //   List<Integer> list= Arrays.asList(5,10,15,20);

        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(10);

        System.out.println(list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(40);
        list2.add(50);
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);

        Set<String> set1=new HashSet<>();
        set1.add("India");
        set1.add("US");
        set1.add("France");
        set1.add("Germany");
        set1.add("India");

        System.out.println(set1);

        Map<Object,Object> map=new HashMap<>();
        map.put("A",10);
        map.put(10,"20");
        map.put("C",30);
        map.put(1,1);
        map.put(1,"1");

        System.out.println(map);

        List<Student> list5=new ArrayList<>();

        Student s1=new Student();
        s1.setId(1);
        s1.setName("A");
        s1.setCity("Pune");

        Student s2=new Student();
        s2.setId(2);
        s2.setName("B");
        s2.setCity("Mumbai");

        list5.add(s1);
        list5.add(s2);

        System.out.println(list5);

        // Normal Java
//        for (Integer i:list) {
//            System.out.println(i);
//        }

        //Java 8, lambda expression
      //  list1.forEach(a-> System.out.println(a));

        //method reference  - double colon(::)
       // list1.forEach(System.out::println);
    }
}

 //Binary Search
// Bubble sort