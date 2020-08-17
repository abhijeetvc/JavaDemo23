public class ExceptionPrg {

    public static void main(String[] args) {
        int a=5;
        int result=0;
        int[] arr={1,2,3,4};
        try {
            result = 5 / 1;
            System.out.println(arr[4]);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("in finally");
        }
        System.out.println("Hiiiiiii");

    }
}
