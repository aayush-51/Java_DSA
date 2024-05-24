import java.util.*;

public class sum {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int even_sum = 0; int odd_sum = 0;
        int num; int choice;

        do {

            System.out.print("enter the number : ");
            num = sc.nextInt();
                    
            if(num % 2 == 0){
                even_sum += num;
            } else {
                odd_sum += num;
            }

            System.out.print("do you want to continue? press 1 for yes or 0 for no : ");
            choice = sc.nextInt();
            
        } while(choice == 1);

        System.out.println("\nsum of the even integers is : " + even_sum);
        System.out.println("sum of the odd integers is : " + odd_sum);

    }
    
}
