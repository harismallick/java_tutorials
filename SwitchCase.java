public class SwitchCase {
    public static void main(String[] args) {
        // How to implement switch cases in Java

        String day = "Sunday";

        switch (day) {
            case "Monday":
                System.out.println("Garfield hates Mondays.");
                break;
            case "Tuesday":
            System.out.println("Tuesday...");
            break;
            case "Wednesday":
            System.out.println("Wednesday = hump day");
            break;
            case "Thursday":
            System.out.println("So nearly Friday.");
            break;
            case "Friday":
            System.out.println("Friyay!");
            break;
            case "Saturday":
            System.out.println("Start of weekend...");
            break;
            case "Sunday":
            System.out.println("Sunday already?");
            break;
            default:
            System.out.println("That is not a day of the week.");
                break;
        }
    }
}
