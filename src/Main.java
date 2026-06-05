
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = in.nextLine();
        System.out.println("Enter password:");
        int password = in.nextInt();
        if (username.equals("junior.bass") && password == 12345) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
            in.close();
        }


    }


}