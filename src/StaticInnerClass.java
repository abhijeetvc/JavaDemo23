public class StaticInnerClass {

    static int a=30;

   static class InnerClassCheck{
        void display(){
            System.out.println("in display"+a);
        }
   }

    public static void main(String[] args) {
        StaticInnerClass.InnerClassCheck i=new StaticInnerClass.InnerClassCheck();
        i.display();
    }
}
