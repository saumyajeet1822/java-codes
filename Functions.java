import java.util.*;
public abstract class Functions {
   /* public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }*/

    //Addition
   /* public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }*/


    //Multiplication
   /* public static int calculateProduct( int a, int b){
        return a*b;
    }
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("Product of 2 numbers is : "+ calculateProduct(a,b));
    }*/

    // To print factorial of a number

    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("invalid Num");
            return;
        }
        int factorial = 1;

        for(int i=n;i>=1;i--){
            factorial= factorial*i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main( String[] args ) {
        System.out.println("please enter a number: ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial( n );
    }
}
