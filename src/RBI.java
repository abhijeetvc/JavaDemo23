public interface RBI {
    void withdraw();  // public and abstract

}
interface RBI1 extends RBI{
    void deposit();
}
class Sbi implements RBI1{

    @Override
    public void withdraw() {
        System.out.println("In withdraw method of SBI");
    }
    @Override
    public void deposit() {
        System.out.println("In deposit method of SBI");
    }
}

class Icici implements RBI1{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of ICICI");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of ICICI");
    }
}

class MainCheck{

    public static void main(String[] args) {
//        RBI sbi=new Sbi();
//        RBI icici=new Icici();
//        RBI1 sbi1=new Sbi();
//        RBI1 icici1=new Icici();

        Sbi s=new Sbi();
        Icici i=new Icici();
        s.withdraw();
        s.deposit();
        i.withdraw();
        i.deposit();
    }
}