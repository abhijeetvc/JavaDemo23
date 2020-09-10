//b) Method Reference to instance method of particular object

import java.util.ArrayList;
import java.util.List;

public class MethodReferenc2 {

    public static void main(String[] args) {
        DemoCheckMethodRef dc=new DemoCheckMethodRef();
        dc.checkReference();

        Employee e1=new Employee(1,"A",30);
        Employee e2=new Employee(2,"B",25);
        Employee e3=new Employee(3,"C",20);

        List<Employee> empList=new ArrayList();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        //Method Reference
        empList.sort(dc::compareByAge);
        empList.forEach(a-> System.out.println(a));

       // empList.sort((o1,o2)->dc.compareByAge(o1,o2));
    }
}

class DemoCheckMethodRef{

    void checkReference(){
        System.out.println("Helloooooo");
    }

    public int compareByAge(Employee o1,Employee o2){
        return o1.getAge()-o2.getAge();
    }
}

class Employee{
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}