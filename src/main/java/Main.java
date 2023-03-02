/**
 * Created by iyasuwatts on 10/17/17.
 */
import javax.xml.namespace.QName;
import java.util.*;
public class Main {
    public static boolean greetings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! enter your name: ");
        String name = scanner.nextLine().toLowerCase();
        String keyname1 = "alice"; String keyname2 = "bob";
        if(name.equals(keyname1)){
            System.out.println("Hello Alice!");
            return true;
        }else if(name.equals(keyname2)){
            System.out.println("Hello Bob");
            return true;
        }else{
            System.out.println("Oh goodness! who are you!");
            return false;
        }
    }
    public static void checker(){
        if(greetings()){
            System.out.println("my readings tell me you are alice or bob");
        }else{
            System.out.println("my readings tell me you are NOT bob or alice");
        }
    }
    public static void main(String[] args ){
        checker();
    }
}
