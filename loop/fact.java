import java.util.*;

public class fact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int factorial = 1;

        System.out.print("enter a number : ");
        int num = sc.nextInt();

        for(int i=num; i>0; i--){
            factorial *= i;
        }

        System.out.print("factorial of " + num +" is "+ factorial);

    }
    
}
