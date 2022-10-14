import java.util.Scanner;
public class votingAge {


    /*Question : Write a function that takes in age as input and returns if that person is eligible
to vote or not. A person of age > 18 is eligible to vote.*/

    public static boolean isEligible(int age){
//        if statement for age if age is less than 18 than the person is not eligible otherwise he is eligible
        if (age>18){
            System.out.println("Eligible");
            return true;
        }
        System.out.println("Not eligible ");
        return false;
        }

        public static void main(String args[]){
//        Using Scanner class to take user input for the age.

            System.out.println(" Enter the age: ");// print statement for information to the user for input the data

            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();

//            final output for the age verification
            System.out.println("Status of eligibility: \n");
            System.out.println(isEligible( age ));

        }
    }
// Prepared by Saumyajeet Das