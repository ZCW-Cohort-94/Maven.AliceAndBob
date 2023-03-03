/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = in.nextLine();
        String bobName = "Bob";
        String aliceName = "Alice";

        if (userName.equalsIgnoreCase(bobName))
        {
            System.out.println("Greetings, Bob. We've been expecting you.");
        } else if(userName.equalsIgnoreCase(aliceName))
        {
            System.out.println("Greetings Alice. I see you have found this place nicely.");
        } else {
            System.out.println("This place is not for you " + userName);
        }


    }
}
