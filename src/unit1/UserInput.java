/*
 @author: Arist
*/

package unit1;
import codehs.*;


public class UserInput extends ConsoleProgram{

    public void run() {
        String userName = readLine("Enter your name: "); // get name
        userName = readLine("Confirm your name: "); // confirm name name

        int userAge = readInt("Enter your age: "); // get age

        double userCurrentMark = readDouble("Enter your current mark: "); // get current mark

        boolean userLocker = readBoolean("Have you been assigned a locker? (true/false) "); // get locker assignment status

        // output info
        System.out.println("\nName: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("Current Mark: " + userCurrentMark);
        System.out.println("Locker Assigned: " + userLocker);
    }
}
