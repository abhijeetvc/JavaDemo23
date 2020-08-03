import java.util.Scanner;

public class LoopsDemo {

    public static void main(String[] args) {

//        for(int i=1;i<5;i++){
//            System.out.println(i);
//        }

//        int i=1;
//        for(;i<5;){
//            System.out.println(i);
//            i++;
//        }

        int[] a={5,20,10,15};
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

//        for (int x:a) {
//            System.out.println(x);
//        }
//
//        int i=1;
//        while(i<5){
//            System.out.println(i);
//            i++;
//        }

        int total=0;
        int number;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Number");
            number=sc.nextInt();
            total+=number;
        }while (number!=0);

        System.out.println("Total: "+total);

    }

}
