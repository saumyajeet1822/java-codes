import java.util.Scanner;

public class greaterThan {
    public static int greaterValue(int a, int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[]args){
        System.out.println("Please enter the first value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the Second value: ");
        int b = sc.nextInt();

        System.out.println("Greater Value: ");
        System.out.println(greaterValue(a,b)) ;
    }
}

//@Saumyajeet Das
