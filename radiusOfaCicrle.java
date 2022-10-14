import java.util.Scanner;
public class radiusOfaCicrle {

/*Question: Write a function that takes in the radius as input and returns the
circumference of a circle.*/
//    Solution for the same given below with the function method
  public static Double getCircumference(Double radius){
      return 2 * 3.14 * radius;

    }

    public static void main( String[] args ) {
        System.out.println("Enter any value: ");
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println("Radius :");
        System.out.println(getCircumference(radius));
    }
}

//Saumyajeet Das
