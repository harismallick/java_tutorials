import java.util.ArrayList;

public class Sfdx {

    public static ArrayList<String> generateStringArray(Integer num) {
        ArrayList<String> output = new ArrayList<String>();
        for (Integer i = 0; i < num; i++) {
            String temp = "Test " + String.valueOf(i);
            output.add(temp);
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println("hello world!");
        ArrayList<String> output = generateStringArray(10);
        System.out.println(output);
    }
}
// The name of the parent class must match the name of the file.
// Being a compiled OOP language, the compiler creates a complied file with the
// class name. The JVM will execute the complied file for which the name matches
// the code file name. Having multiple classes in the same java file will result
// in multiple compiled files being created.

