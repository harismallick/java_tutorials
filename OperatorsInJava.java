public class OperatorsInJava {
    public static void main(String[] args) {
        int startingNum = 5;
        int add = startingNum + 5;
        int subtract = startingNum - 3;
        int divide = startingNum / 2;
        double divide2 = (double) startingNum / 2; // Since startingNum is an int. Must declare the output to be stored as float or double if you want accurate decimal places.
        int remainder = startingNum % 2;
        System.out.println("The starting number is: " + startingNum);
        System.out.println("Number + 5 = " + add);
        System.out.println("Number - 3 = " + subtract);
        System.out.println("Number / 2 = " + divide);
        System.out.println("Float Number / 2 = " + divide2);
        System.out.println("Remainder of Number / 2 = " + remainder);

    }
}
