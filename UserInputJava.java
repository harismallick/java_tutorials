// prompt() accepts user input in JS
// input() accepts user input in Python
// Similarly, we need to import the Scanner package in Java to accept user input in the terminal
// When establishing an IO stream, its good practice to close the stream once done to prevent resource leaks.
// This is achieved using the try, catch, and finally blocks of code.
// Add object.close() in the finally block of code.

import java.util.Scanner;

public class UserInputJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instantiate a scanner object
        try {
            System.out.println("What is your name?");
            String name = scanner.nextLine(); // accept a line of text from the user
    
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            scanner.nextLine(); // This is to reset scanner to a new line to accept another input from the user. nextInt() does not resolve the \n.

            System.out.println("What is your favourite food?");
            String food = scanner.nextLine();

            System.out.println("Hi, your name is " + name + ".");
            System.out.println("You are " + age + " years old.");
            System.out.println("Your favourite food is: " + food + "!");
        } finally {
            scanner.close();
        }

    }
}