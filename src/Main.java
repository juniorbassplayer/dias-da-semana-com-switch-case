
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type a week day");
        int week = in.nextInt();
        switch (week) {
            case 1:
                System.out.println("today is sunday");
                break;
            case 2:
                System.out.println("today is monday");
                break;
            case 3:
                System.out.println("today is tuesday");
                break;
            case 4:
                System.out.println("today is wednesday");
                break;
            case 5:
                System.out.println("today is Thursday");
                break;
            case 6:
                System.out.println("today is friday");
                break;
            case 7:
                System.out.println("today is saturday");
            default:
                System.out.println("INVALID DAY");
        }


    }


}




