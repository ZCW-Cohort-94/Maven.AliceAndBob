import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner newScanner = new Scanner(System.in);

        System.out.println("Enter name...");

        String userName = newScanner.nextLine();

        if(userName.equals("Alice")){
            System.out.println("Hello Alice!");
        }
        else if(userName.equals("Bob")){
            System.out.println("Hello Bob!");
        }
    }
}
