import java.util.*;

// Area of a square
public class square {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of a sqaure : ");
        float side = sc.nextFloat();

        float area = side * side;
        System.out.print("Area of the sqaure is : " + area);
    }
    
}
