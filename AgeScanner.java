import java.util.Scanner; // Import the Scanner class

public class AgeScanner { // Renamed class to avoid conflict

    public static void main(String args[]) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter your age");

        String myAge = inputDevice.nextLine();
        int age = Integer.parseInt(myAge);

        System.out.println("You are " + age + " years old");
    }
}