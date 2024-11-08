//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void Palindrome(String userInput){
        String reversedString ="";
        for(int i = 0 ; i <userInput.length(); i++)
        {
            char c = userInput.charAt(i);//extracts each character
            reversedString = c + reversedString; //adds each character in front of the existing string
        }
        if (reversedString.equals(userInput))
            System.out.println("Palindrome");
    }
    public static double simpleInterestCalculator(double principal, double rateOfInterest, int time){
        return principal * rateOfInterest * time;
    }
    public static void maxElementFromArray(int [] array){
        if (array != null && array.length > 0) {
            int min = Arrays.stream(array).min().getAsInt();
            int max = Arrays.stream(array).max().getAsInt();
            int diff = max - min;
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("Diff: " + diff);
        }
        else System.out.println("Array is null or empty.");
    }
    public static void sumOfElements(int [] array){
        if (array != null && array.length > 0){
            int sum = 0;
            int i = 0;
            while (i<array.length) {
               sum += array [i];
                i++;
            }
            System.out.println("Sum of the elements : " + sum);
        } else System.out.println("Array is null or empty.");
    }
    public static double basicArithmeticOperations(double firstNumber, double secondNumber, char operation){
        double result = 0;
        switch (operation){
            case '+' :
                result =  firstNumber + secondNumber;
                break;
            case '-' :
                result =  firstNumber - secondNumber;
                break;
            case '*' :
                result =  firstNumber * secondNumber;
                break;
            case '/' :
                result =  firstNumber / secondNumber;
                break;
            default : System.out.println("Invalid operator");
        }
        return result;
    }
    public static void oddChecker(int number){
        if(number % 2 == 0) System.out.println(number + " is even");
        else System.out.println(number + " is odd");
    }
    public static void votingEligibility(int age){
        int voting_age = 18;
            if (age > 0 && age >= voting_age) System.out.println("Old enough to vote!");
            else System.out.println("Old enough to vote!");
    }
    public static String  getTheDayOfTheWeek(int day){
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        return dayName;
    }
    public static void urlName(String url){
       if (url.endsWith(".com")) System.out.println("Commercial site");
       else if (url.endsWith(".ro")) System.out.println("Romanian site");
       else if (url.endsWith(".org")) System.out.println("Organisational site");
       else System.out.println("Unknown site");
    }
    public static double salaryIncreaseCalculator(double currentSalary, int employerRating){
        double newSalary = 0;
        if (currentSalary > 0) {
            if (employerRating > 0 && employerRating <=3) {
                if (employerRating == 1) newSalary = currentSalary * 1.06;
                else if (employerRating == 2) newSalary = currentSalary * 1.04;
                else newSalary = currentSalary * 1.015;
            }
            else System.out.println("Rating Validation error");
        }
        else System.out.println("Salary Validation error");
        return newSalary;
    }

    //Dana problems




    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /* 2. Write a Java program to find the k largest elements in a given array.
        The parameters are: k and the array (both should be read from the console)*/
        System.out.println("Array size: ");
        int size = keyboard.nextInt();

        System.out.println("Enter the array elements (max 4): ");
        int[] testArray = new int[size];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = keyboard.nextInt();
        }
        System.out.println("Limit: ");
        int limit = keyboard.nextInt();

        if(limit < testArray.length) {
            Arrays.sort(testArray);
            for (int j = testArray.length - limit; j < testArray.length; j++) {
                System.out.println("Element" + j + " : "+ testArray[j]);
            }
        }
        else
            System.out.println("Limit should be less then array size");
        keyboard.close();



        //1 Java program to check whether a string is a Palindrome
        //System.out.println("Enter the string: ");
        //String s = keyboard.nextLine();
        //Palindrome(s);

        // 2 Write a Program to Calculate Simple Interest in Java (SI = P × R × T, where P = Principal, R = Rate of Interest, and T = Time period.)
        //System.out.println("Enter the Principal: ");
        //double principal = keyboard.nextDouble();
        //System.out.println("Enter the Rate of Interest: ");
        //double rateOfInterest = keyboard.nextDouble();
        //System.out.println("Enter time in months: ");
        //int time = keyboard.nextInt();
        //System.out.println(simpleInterestCalculator(principal,rateOfInterest, time));

        //3 Create a function that takes an array and returns the difference between the biggest and smallest numbers
        //int[] myNum = {1,2,3,4,5,6};
        //maxElementFromArray(myNum);

        //4 Write a function that finds the sum of an array (e.x: sum([1, 2, 3, 4]) ➞ 10)
        //int[] elements = {10,5,5,1};
        //umOfElements(elements);

        //5 Write a function that does the following for the given values: add, subtract, divide and multiply. These are
        // simply referred to as the basic arithmetic operations.
        //System.out.println("First number : ");
        //double firstNumber = keyboard.nextDouble();
        //System.out.println("Second number : ");
        //double secondNumber = keyboard.nextDouble();
        //System.out.println("Write between : + , - , * , /");
        //char operation = keyboard.next().charAt(0);
        //System.out.println(basicArithmeticOperations(firstNumber, secondNumber, operation));

        //6 The variables have to be defined, but in this challenge they will be defined for you. All you have to do is
        // check the variables, do some string to integer conversions, use some if conditions, and apply the arithmetic
        // operation. ?????

        //7 Write a program called CheckOddEven which prints "Odd Number" if the int variable "number" is odd, or "Even
        // Number" otherwise. The program shall always print "bye!" before exiting.
        //System.out.println("Enter the number: ");
        //int number = keyboard.nextInt();
        //oddChecker(number);

        /*8 Write a program which does the following:
        Let's think of a real-life example where we need to find out if a person is old enough to vote.
        Find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18.
        Declare the variables age and voting_age - and initialize them to the values 25 and 18 - i.e. the age and the
        voting age respectively.
        Compare age and voting_age using the syntax given above and output the following
        "Old enough to vote!" if age is greater than or equal to voting_age
        "Not old enough to vote." if age is lesser than voting_age*/
        //System.out.println("How old are you ?");
        //int age = keyboard.nextInt();
        //votingEligibility(age);

        //9 Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        //System.out.println("Day of the week : ");
        //int day = keyboard.nextInt();
        //System.out.println(getTheDayOfTheWeek(day));

        /*10 Write a program to find out the type of website from the URL:
        .com – commercial website
        .org – organization website
        .in – Indian website*/
        //System.out.println("Enter the URL: ");
        //String url = keyboard.nextLine();
        //urlName(url);

        /* Complete the following program to determine the raise and new salary for an employee by adding if ... else
        statements to compute the raise.

        The input to the program includes the current annual salary for the employee
        and a number indicating the performance rating (1=excellent, 2=good, and 3=poor).

        An employee with a rating of 1 will receive a 6% raise, an employee with a rating of 2 will receive a 4% raise,
        and one with a rating of 3 will receive a 1.5% raise.*/

       /*  System.out.println("Current salary : ");
        double currentSalary = keyboard.nextDouble();
        System.out.println("Employer rating : ");
        int employerRating = keyboard.nextInt();
        System.out.println(salaryIncreaseCalculator(currentSalary, employerRating)); */
    }
}