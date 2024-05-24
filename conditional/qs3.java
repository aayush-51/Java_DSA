import java.util.*;

public class qs3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter week number (1-7) : ");
        int week_name = sc.nextInt();

        switch (week_name){

            case 1 : System.out.print("it's monday");
                     break;
            case 2 : System.out.print("it's tuesday");
                     break;
            case 3 : System.out.print("it's wednesday");
                     break;
            case 4 : System.out.print("it's thursday");
                     break;
            case 5 : System.out.print("it's friday");
                     break;
            case 6 : System.out.print("it's saturday");
                     break;
            case 7 : System.out.print("it's sunday");
                     break;
            default : System.out.print("wrong input try again :) ");
        }
    }

    
}
