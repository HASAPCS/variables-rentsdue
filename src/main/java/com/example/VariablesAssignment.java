package com.example;

public class VariablesAssignment {

    // TODO: Declare and initialize a byte variable with any value between 1 and 127
    byte byteVariable=69

    // TODO: Declare and initialize a short variable with any value between 1 and 32767
    short shortVariable=420

    // TODO: Declare and initialize an int variable with any positive value
    int intVariable=22

    // TODO: Declare and initialize a long variable with any positive value
    long longVariable=33

    // TODO: Declare and initialize a float variable with any positive value
    float floatVariable=22.45

    // TODO: Declare and initialize a double variable with any positive value
    double doubleVariable=22.55

    // TODO: Declare and initialize a char variable with the initial of your first name
    char charVariable='H'

    // TODO: Declare and initialize a boolean variable with the value true or false
    boolean booleanVariable=True

    // TODO: Create a method that accepts two integers as parameters and returns their sum
    public int sum(int a, int b) {
        return a+b; // Change this line to return the actual sum
    }

    // TODO: Create a method that accepts two double parameters and returns their product
    public double product(double a, double b) {
        return a*b; // Change this line to return the actual product
    }

    // TODO: Create a method that accepts a string parameter and returns it in reverse
    public class ReverseString {

        // Method to reverse a string
        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder();
    
            // Loop through the input string in reverse order and append each character to the 'reversed' StringBuilder
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }
    
            // Convert the StringBuilder to a String and return it
            return reversed.toString();
        }
    
        public static void main(String[] args) {
            String original = "Hello, World!";
            String reversed = reverseString(original);
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }
    }
    
