//Encapsulation: It bundles the fields and methods inside the class

public class Person {

    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Maincheck{

    public static void main(String[] args) {
        Person p=new Person();
        p.setId(1);
        p.setName("A");
        p.setCity("Pune");

        System.out.println("Id is: "+p.getId());
        System.out.println("Name is: "+p.getName());
        System.out.println("City is: "+p.getCity());


    }
}