import javax.swing.JOptionPane;

public class IntroToGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name.");
        JOptionPane.showMessageDialog(null, "Hello, " + name);
        // Input dialog box returns a string. Integers and other datatypes must be parsed correctly using parsing methods.

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm:"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
    }
}
