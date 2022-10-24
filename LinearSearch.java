//import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int [] arr, int key){
        int size = arr.length;
        for (int i =0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
      /*  Scanner sc =new Scanner(System.in);

        int arr =sc.nextInt();

        int searchKey =sc.nextInt();*/

        int []arr={23,45,21,55,234,1,34,90};
        int searchKey =34;

        System.out.println("key"+ searchKey+ "found at Index"+ linearSearch(arr,searchKey));
    }
}
