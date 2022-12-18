/*Question 1: Print numbers from n to 1 (Decreasing order)*/
public class printDec {

    public static void printDec1(int x){
        if(x==1){
            System.out.print(1);
            return;
        }
        System.out.print(x + " ");
        printDec1(x-1);
    }



    public static void main(String[] args) {
        int n= 10;
        printDec1(n);
    }
}
