import java.util.*;

public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a munber : ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            
            int multiply = num * i;
            System.out.print(multiply + " ");
        }
    }
    
}
