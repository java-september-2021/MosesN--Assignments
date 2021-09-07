public class Basics {
    public static void main(String[] args) {
        //print255();
        //printOdd255();
        //printSum();
        int[] arr1 = {-1,-3,-5,7,-59,-13};
        //iterateArr(arr1);
        //findMax(arr1);
        int[] arr2 = {2, 10, 3};
        int[] arr3 = {2, 2, 2}; //2
        //findAvg(arr2); //2
        oddArray();


    }

    //Print 1-255
    //Write a method that prints all the numbers from 1 to 255.
    public static void print255() {
        for (int i=1; i<=255; i++) {
           System.out.println(i); 
        }
        
    }

    //Print odd numbers between 1-255
    //Write a method that prints all the odd numbers from 1 to 255.
    public static void printOdd255() {
        for (int i=1; i<=255; i+=2) {
           System.out.println(i); 
        }
           
    }
    //Sigma of 255 AKA Sum to 255
    //Write a method that creates and eventually returns a sum variable that adds up all 
    //the numbers from 1 to 255. In this method you are not printing the sum, except to 
    //debug if you need to, the method should return the sum. Note: You do not need an   
    //array to write this function. 

    public static void print255() {
        for (int i=1; i<=255; i++) {
           System.out.println(i); 
        }
        
    }



    //Iterating through an array
    //Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of 
    //the array and print each value on the screen. Being able to loop through each member of the 
    //array is extremely important.
    
    public static void iterateArr(int[] x) {
        for (int i=0; i<x.length; i++) {
           System.out.println(x[i]); 
        }
        
    }


    //Find Max
    //Write a method (sets of instructions) that takes any array and prints the maximum value in the array. 
    //Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.

    public static void findMax(int[] arr) {
        int max = 0;
        for (int i=0; i<x.length; i++) {
           System.out.println(x[i]); 
        }
        System.out.println(max);
        
    }


    //Array with Odd Numbers 
    //Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. 
    //When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public static void oddArray() {
        ArrayList<object> y = new ArrayList<Object>();
        for (int i=1; i<=255; i+=2) {
            y.add(i);
            System.out.println(y);
        }
    }
        

}