import java.util.Scanner;
public class printAverage {

    // Enter three numbers from the user and make a function to print their average
//    public static void average( int a, int b, int c ) {
//        return;
//    }
//@Saumyajeet Das
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c) / 3;
        System.out.println(average);

    }
}