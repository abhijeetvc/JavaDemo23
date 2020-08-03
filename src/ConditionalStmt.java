public class ConditionalStmt {

    String check(){
        int a=10;

        if(a>5){
            return "Greater";
        }
        return "Smaller";
    }

    public static void main(String[] args) {
        ConditionalStmt c=new ConditionalStmt();
        System.out.println(c.check());

    }
}
