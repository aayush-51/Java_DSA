import java.util.*;


// Total bill of items
public class bill {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of a pencil : ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of a pen : ");
        float pen = sc.nextFloat();

        System.out.print("Enter the cost of a eraser : ");
        float eraser = sc.nextFloat();

        float total_cost = pencil + pen + eraser;
        System.out.println("Total cost of the items are : " + total_cost);


        // Add on with 18% gst
        double cost_with_gst = total_cost + (total_cost * 0.18);
        System.out.println("Total cost of the items with 18% gst are : " + cost_with_gst);

        
    }
}
