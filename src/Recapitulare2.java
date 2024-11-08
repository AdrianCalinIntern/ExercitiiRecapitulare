import java.util.Arrays;
import java.util.Scanner;

public class Recapitulare2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /* 2. Write a Java program to find the k largest elements in a given array.
        The parameters are: k and the array (both should be read from the console)
        System.out.println("Array size: ");
        int size = keyboard.nextInt();

        System.out.println("Enter the array elements (max): " + size);
        int[] testArray = new int[size];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = keyboard.nextInt();
        }
        System.out.println(" largest 'n' elements in a given array :  ");
        int limit = keyboard.nextInt();

        if(limit < testArray.length) {
            Arrays.sort(testArray);
            for (int j = testArray.length - limit; j < testArray.length; j++) {
                System.out.println("Element" + j + " : "+ testArray[j]);
            }
        }
        else
            System.out.println("Limit should be less then array size");

        */


        /*
        * 3. Write a Java program:
            - to read a string formed by digits
            - check if the number is a positive number
            - repeatedly add all its digits until the result has only one digit
        * */
        System.out.println("Array size: ");
        String input = keyboard.next();
        int numeric = Integer.parseInt(input);
        if(numeric >= 0)
            System.out.println(numeric + " : is positive");
        else
            System.out.println(numeric + " : is negative");
        


        }






        keyboard.close();
    }
}
