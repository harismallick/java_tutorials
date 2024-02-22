public class WhileLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        // another way of writing while loops in Java:
        System.out.println("\n");
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while(j < 10);
        // Using do-while ensures the code in do-block is executed atleast once.
    }
}
