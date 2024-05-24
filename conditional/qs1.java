import java.util.*;

public class qs1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.print("positive number");
        } else {
            System.out.print("negative number");
        }
    }
}
