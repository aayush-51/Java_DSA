import java.util.*;

public class mqs1 {

    public static float AvgOf3 (float a, float b, float c){
        float result = (a+b+c)/3;
        return result;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println(AvgOf3(3, 3, 3));
    }
}