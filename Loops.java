import java.util.*;
public class Loops {
    public static void main(String[] args) {
        //for loop example:>

       /* for(int counter = 0; counter<11; counter++){
            System.out.println(counter+" ");
        }*/

        /*// while loop
            int i = 0;
            while(i<5){
                System.out.println(i);
                i++;
            }*/


        // do while
       /* int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<11);*/

        // scanner class @Saumyajeet
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       /* int sum =0;
        for(int i = 0; i <= n; i++){
            sum=sum+i;
        }
        System.out.println(sum);*/
// To print a table of multiplication

        for(int i =0;i<11;i++){
            System.out.println("Multiply");
            System.out.println("Sum:"+ i*n);
        }


    }
}

//@ Described by Saumyajeet Das
