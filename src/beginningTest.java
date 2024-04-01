public class beginningTest {
    public static void main(String[] args) {
        //Import the scanner class down below:

        //Declare test variable:
        int a = 12;

        //Practice if statement:
        if (a>10){
            System.out.println("Welcome to the test!");
        } else
            System.out.println("You're not welcome!");

    //Adding code for Chapter 7 on Arrays
        int[] testerArray = new int[10];
            testerArray[1] = 22;
        System.out.println(testerArray[1]);
        // ^^ another way of creating this same array with another value is below:
        int[] twoNumbers = {1, 2};
            System.out.println(twoNumbers[0]);
            System.out.println(twoNumbers[1]);
            System.out.println("The values in the array at index 0 & 1 is: " + twoNumbers[0] + " & " + twoNumbers[1]);

    }
    
}