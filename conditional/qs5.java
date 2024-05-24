import java.util.*;

public class qs5 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a year : ");
        int year = sc.nextInt();


        // if ( (year % 4 == 0) || (year % 400 == 0) ){
        //     System.out.print("it's a leap year");
        // } 
        // else if ( year % 100 == 0){
        //     System.out.print("it's a leap year");
        // }
        // else {
        //     System.out.print("it's not a leap year");
        // }


        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ( (year % 100 == 0) && (year % 400 == 0) );

        if ( x && ( y || z ) ){
            System.out.print("it's a leap year");
        } else {
            System.out.print("it's not a leap year");
        }
    }
    
}
