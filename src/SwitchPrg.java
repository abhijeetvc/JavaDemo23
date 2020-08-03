import java.util.Scanner;

public class SwitchPrg {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1: ");
        int no1=sc.nextInt();
        System.out.println("Enter no2: ");
        int no2=sc.nextInt();

        System.out.println("Enter choice: ");
        int choice=sc.nextInt();

        int result=0;

        switch (choice){
            case 1:
                result=no1+no2;
                System.out.println("Addition is: "+result);
                break;

            case 2:
                result=no1-no2;
                System.out.println("Subtraction is: "+result);
                break;

            case 3:
                result=no1*no2;
                System.out.println("Multiplication is: "+result);
                break;

            case 4:
                result=no1/no2;
                System.out.println("Division is: "+result);
                break;

            default:
                System.out.println("Incorrect choice");
                break;
        }
    }
}
