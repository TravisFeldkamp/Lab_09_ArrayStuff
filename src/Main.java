import java.util.Scanner;//import scanner
import java.util.Random;//import random number generator
public class Main {
    public static double getAverage(int [] values)//create new method
    {   int sum = 0;//initialize sum variable
        for (int x: values) //for each value of x
            sum += x;// sum is sum + x
        sum = sum / values.length; //takes total sum and divides it by amount of integers
        System.out.println("average value of the array is " + sum);//output to user
        return sum;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);//initialize scanner
        Random rnd = new Random();//initialize random number
        int[] dataPoints;// set array to dataPoints
        dataPoints = new int[100];//set array to 0-99
        int val = rnd.nextInt(100) + 1;// set array to 1-100
        int index = rnd.nextInt(dataPoints.length);
        int sum = 0;//set variable sum to 0
        String avgData = "The average of the data set is: ";// set variable to a string


        for (int x = 0; x < dataPoints.length; x++) {//from 0 - 100 count up by 1
            dataPoints[x] = rnd.nextInt(100) + 1;//create random numbers for array
            System.out.println("Your random value is " + dataPoints[x]);//output to user

        }
        for (int x = 0; x < dataPoints.length; x++) { //from 0 - 100 count up by 1
            System.out.printf("%d | ", dataPoints[x]);

        }

        for (int x = 0; x < dataPoints.length; x++) {//from 0 - 100 count up by 1
            sum = sum + dataPoints[x];//add each data point to the sum and make that new sum
        }
        int avg = sum / dataPoints.length;//divide sum by how many numbers there are to get average
        int userInput = 0;//create variable
        int sameNum = 0;//create variable

        System.out.println("\nThe sum of the data points is: " + sum);//output to user
        System.out.println("The average of this data set is: " + avg);//output to user
        userInput = (SafeInput.getRangedInt(in, "input a value between ", 1, 100));//use safeinput method to ask a user for a number between 1 and 100
        for (int x = 0; x < dataPoints.length; x++) {//from 0 - 100 count up by 1
            if (userInput == dataPoints[x]) {//if user input = to any data point run this block

            }
        }
        System.out.println("your number was found in the array " + sameNum + " times");//output to user

        int userNum = 0;//declare variable
        boolean equal = false;//declare boolean variable



        userNum = (SafeInput.getRangedInt(in, "input a value between", 1, 100));//ask user for input from 1-100

        for (int x = 0; x < dataPoints.length; x++) {//from 0 - 100 count up by 1
            if (dataPoints[x] == userNum)//if user input = data point
            {
                equal = true;//set equal to true
                System.out.println("Value " + userNum + " found at array index " + x);//output to user
                break;
            }
        } if (!equal)//if false output this block to user
        {
            System.out.println(+ userNum + " was not found in the array list ");//output to user
        }


        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int x = 0 ; x < dataPoints.length; x++ )//from 0 - 100 count up by 1
        {
         if (min > dataPoints[x])//if min is greater than data point
         {
             min = dataPoints[x];//set min = data point
         }
         if (max < dataPoints[x])//if max is less than data point
        {
            max = dataPoints[x];//set max = data point
        }
        }
        System.out.println("The minimum is " + min);//output to user
        System.out.println("The maximum is " + max);//output to user



        System.out.println("Average of dataPoints is:"+getAverage(dataPoints));//output to user while calling method




    }

}