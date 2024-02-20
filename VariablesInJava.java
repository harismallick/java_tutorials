public class VariablesInJava {
    public static void main(String[] args) {
        int x; // This is the declaration
        x = 5; // This is the assignment
        int y = 6; // Doing both the above steps in 1 line is called initialisation
        long z = 983475943856294723L; // When declaring a long, it must be followed by an "L".
        System.out.println(x + y);
        System.out.println("My long number is: " + z); 
        boolean test = false;
        double pi = 3.14;
        char letter = 'h';
        String word = "hello world"; // String is a referenced datatype, ie, a class. So written with capital letter.
        System.out.println(test + "\n" + pi + "\n" + letter + "\n" + word);

        // Switching variable values in Java:
        // Like most other languages, this is achieved by creating a temporary variable to store one of the values

        String word1 = "Hello";
        String word2 = "World";
        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        String temp;
        temp = word1;
        word1 = word2;
        word2 = temp;
        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
    }
}
