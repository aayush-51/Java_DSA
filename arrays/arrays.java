import java.util.*;

public class arrays{

    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }


    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static int linearSearch(String menu[], String item) {

        for(int i=0; i<menu.length; i++){
            if(menu[i] == item){
                return i;
            }
        }

        return -1;
    }



    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<numbers.length; i++){
            // if(largest < numbers[i]) {
            //     largest = numbers[i];
            // }

            largest = Math.max(numbers[i], largest);
        }

        return largest;
    }

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }



    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key){ // found
                return mid;
            } 
            else if(numbers[mid] > key){ // 1st halt (left)
                end = mid-1;
            } else {                     // 2nd half (right)
                start = mid+1;
            }
        }

        return -1;
    }



    public static void reverseArray(int numbers[]) {
        int start = 0, end = numbers.length-1;

        while(start < end) {
            //swap
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++; end--; 
        }
    }


    public static void printNumbers(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }



    public static void printPairs(int numbers[]){
        int tp = 0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                int next = numbers[j];
                System.out.print("(" + curr + "," + next + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);  // tp = n(n-1)/2
    }



    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){ // print
                    System.out.print(numbers[k] + " "); //subarray
                }
                ts++;
                System.out.println();
            }
             System.out.println();
        }
        System.out.println("Total subarrays = " + ts); // ts = n(n+1)/2
    }



    public static void sumofSubarray(int numbers[]){

        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int sum = 0;
                int end = j;
                for(int k=start; k<=end; k++){ // print
                    System.out.print(numbers[k] + " "); //subarray
                    sum = sum + numbers[k];
                }
                System.out.println(" = " + sum);
                maxSum = Math.max(sum, maxSum);
                minSum = Math.min(sum, minSum);    
            }
            System.out.println();
        }
        System.out.println("maximum sum : " + maxSum);
        System.out.println("minimum sum : " + minSum);

    }



    public static void prefixSum(int numbers[]){

        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

             int sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start-1];
             // System.out.println(" = " + sum);
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
            }
        }
        System.out.println("prefix maximum sum : " + maxSum);
        System.out.println("prefix minimum sum : " + minSum);
        
    }



    public static void kadanceSumArray(int numbers[]){

        int sum = 0, maxSum = Integer.MIN_VALUE;

        System.out.println(maxSum);

        int flag = 0;
        for(int i=0; i<numbers.length; i++){
            sum = 0;
            if(numbers[i] >= 0){
                flag = 1;
            } else {
            sum = sum + numbers[i];
            maxSum = Math.max(maxSum, sum);
            }
        }

        if(flag == 0){
            System.out.println("kadance maximum sum : " + maxSum);
        } else {
        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
            if(sum < 0){
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("kadance's maximum sum : " + maxSum);
    }
    }




    public static int trappedRainwater(int height[]) { // -> O(n)
        int n = height.length;

        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i=0; i<n; i++){
            // waterLevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = ( waterLevel - height[i] ) * width
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }




    public static int buyAndSellStocks(int prices[]) {  // -> O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        int minStockPrice = 0, maxStockPrice = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
                maxStockPrice = Math.max(prices[i], maxStockPrice);

            } else {
                buyPrice = prices[i];
                minStockPrice = prices[i];
            }
        }

        System.out.println("minimum stock price for buying : " + minStockPrice);
        System.out.println("maximum stock price for selling : " + maxStockPrice);

        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int marks[] = new int[50];

        // int numbers[] = {1, 2, 3};

        // String fruits[] = {"mango", "apple", "orange"};


        // int marks[] = {97, 98, 99};
        // int nonChangable = 5;
        // update(marks, nonChangable);
        // System.out.println(nonChangable);

        // // print our marks
        // for(int i=0; i<marks.length; i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();



        // linear search -> O(n)
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // String menu[] = {"dosa", "samosa", "kachori", "fruti", "ice-cream"};
        // int key = 10;
        // String item = "fruti";

        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("not found");
        // } else {
        //     System.out.println("key is at index : " + index);
        // }


        // int index = linearSearch(menu, item);
        // if(index == -1){
        //     System.out.println("not found");
        // } else {
        //     System.out.println("item is at index : " + index);
        // }



        // largest number -> O(n)
        //  int numbers[] = {1, 2, 6, 3, 5};

        //  System.out.println("largest value is : " + getLargest(numbers));

        // smallest number
        // System.out.println("smallest value is : " + getSmallest(numbers));



        // binary search -> O(logn)
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 25;

        // System.out.println("index for key is : " + binarySearch(numbers,key));



        // reverse an array -> O(n) & O(1)
        // int numbers[] = {2, 4, 6, 8, 10};
        // printNumbers(numbers);

        // reverseArray(numbers);
        // printNumbers(numbers);


        
        // pairs in array -> O(n2)
        // int numbers[] = {2, 4, 6, 8, 10};
        // printPairs(numbers);



        // print sub array 
        //  int numbers[] = {2, 4, 6, 8, 10};
        // printSubarrays(numbers);  -> O(n3)

        // maxsum & minsum of subarry -> by self & same from di
        // int array[] = {1, -2, 6, -1, 3};
        // sumofSubarray(array);   // -> O(n3)


        // prefix sum
        // int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // prefixSum(array); // O(n2)


        // kadance max subarray sum

        // kadanceSumArray(array); // -> O(n)

         int minarray[] = {-10, -2, -3, -4};

         kadanceSumArray(minarray);
    


        // trapping rain water
        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(trappedRainwater(height));



        // Buy and Sell Stocks
        // int prices[] = {7, 1, 5, 3, 6, 4};
        // System.out.println("maximum profit = " + buyAndSellStocks(prices));




        





    }
}