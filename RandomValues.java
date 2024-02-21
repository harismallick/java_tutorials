import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        // You can generate random integers, floats, doubles and boolean using the Random class.
        int x = random.nextInt(); // This will generate any number between -2 billion and +2 billion.
        // To limit the search, you can declare a max value as an argument.
        int y = random.nextInt(6)+1; //This is how to emulate a random roll of the dice.
        double z = random.nextDouble(); // This generates a random number between 0 and 1. Generating random %ages is an example use case.
        boolean bool = random.nextBoolean(); // This will randomly generate true or false.

        System.out.println(x + "\n" + y + "\n" + z + "\n" + bool);
    }
}
