import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        checkAndGreetUser();
    }

    private static void checkAndGreetUser() {
        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.println("Enter username");
        userName = myObj.nextLine();
        if (userName.equals("Alice")) {
            System.out.println("Hello Alice");
        } else if (userName.equals("Bob")) {
            System.out.println("Hello Bob");
        }
    }
}

