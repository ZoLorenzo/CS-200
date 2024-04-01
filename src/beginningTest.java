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
        //creating an array with a basic for-loop:
            int[] newArray = new int[10];
            for(int i = 0; i < newArray.length; i++){ // <- this creates an array that will 10 slots, from 0-9, so that "i" is less than/equal to "newArray" length [10]
                newArray[i] = i;
                System.out.println(newArray[i] + " ");
            }
        //creating an array with values from 0-100:
        int[] oneHundred = new int[100];
            for(int i = 0; i < oneHundred.length; i++){
                int count = 0;
                oneHundred[i] = i;
                if (count % 10 == 0) {

                    System.out.println(oneHundred[i] + "\n");
                } else
                    System.out.println(oneHundred[i] + " ");
            }
        //adding the total from all fo the array values and printing them out:
            int[] myList = new int[10];
            int finalTotal = 0;
                for(int i = 0; i < myList.length; i++){
                        myList[i] = i;
                        finalTotal += myList[i];
                        System.out.println(finalTotal);
                }

    }
    
}