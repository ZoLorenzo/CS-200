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

        //practicing on invoking an array through a method:
            public static void promptArray(int[] array){{
                for (int i = 0; i < arrayNew.length; i++){
                    array[i] = i;
                    System.out.println(array[i] + " ");
                }
            }}
            promptArray(new int[]{1,2,3,4,5});
        
        //Practicing the "Binary Search Method" with arrays: // 04.01.24 -- 9:56am
        public static int biSearch(int[] list, int key){
            int low = 0;
            int high = list.length - 1;

            while (high >= low){ //allows the program to keep searching:
            int mid = (high + low) / 2;
            if (key < list[mid])
                high = mid -1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
            } //end of the while-loop for "Binary Search Method"
            return -low - 1; //signifies if the key is not in the list + where it would be placed...

    }
    
}