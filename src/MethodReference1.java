//Method Reference:
// 4 Types: a) Method Reference to static method of class
//          b) Method Reference to instance method of particular object
//          c) Method Reference to an instance method of arbitrary objects of particular type
//          d) Method Reference to constructor

import java.util.Arrays;
import java.util.List;

public class MethodReference1 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        //lambda expression
     //   list.forEach(a-> System.out.println(a));

        //method reference
        list.forEach(CheckStaticReference::display);


    }
}

class CheckStaticReference{
    static void display(Integer i){
        System.out.println("Hiiiiiiii : "+i);
    }
}