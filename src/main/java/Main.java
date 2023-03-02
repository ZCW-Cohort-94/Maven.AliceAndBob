/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {

    public static void main(String[] args ){

        String input;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        input = userIn.next();
        userIn.close();
        System.out.println(aliceBob(input));

    }

    static String aliceBob(String name) {
        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1);
        } else {
            return "You are not Alice or Bob";
        }
    }

}