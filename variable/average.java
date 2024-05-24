import java.util.*;


//Average of three numbers
public class average{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        float A = sc.nextFloat();

        System.out.print("Enter B : ");
        float B = sc.nextFloat();

        System.out.print("Enter C : ");
        float C = sc.nextFloat();

        float average = ( A + B + C ) / 3;
        System.out.print("average of " + A + " , " + B + " & " + C + " is : " + average);



    }
}