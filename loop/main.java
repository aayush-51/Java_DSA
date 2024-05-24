import java.util.*;

public class main{
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);


// while loop

        // int counter = 0;

        // while(counter < 10) {
        //     System.out.println("Hello world " + counter + " :) ");
        //     counter++;
        // }


        // int count = 1;

        // while(count <= 10) {
        //     System.out.print(count + " ");
        //     count++;
        // }

        // System.out.print("enter range : ");
        // int range = sc.nextInt();

        // while(count <= range){
        //     System.out.print(count + " ");
        //     count++;
        // }




        // for loop

        // for(int i=0; i<10; i++){
        //     System.out.print("Hello world ");
        // }



        // for(int line = 1; line<=4; line++){
        //     System.out.println("****");
        // }

        // int line = 1;
        // while(line <= 4){
        //     System.out.println("****");
        //     line++;
        // }



        // print reverse of a number

        // int n = 13042004;
        
        // while( n > 0 ) {
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n / 10; 
        // }


        // reverse the given number

        // int n = 13042004;
        // int rev = 0;
        
        // while( n > 0 ) {
        //     int lastdigit = n % 10;
        //     rev = ( rev * 10) + lastdigit;
        //     n = n / 10; 
        // }

        // System.out.print(rev);





        // do while loop

        // int count = 1;

        // do {
        //     System.out.println("Hello World");
        //     count++;
        // } while (count <= 10);



        // break statement

        // for(int i=1; i<=5; i++){
        //     if(i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // System.out.print("i am out if the loop");




        // int n;

        // do {
        //     System.out.print("enter number : ");
        //     n = sc.nextInt();
        //     System.out.println(n);
        // }
        // while (n % 10 != 0);



        // do {
        //     System.out.print("enter number : ");
        //     int n = sc.nextInt();
        //     if ( n % 10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // }
        // while (true);





        // continue statement

        // for(int i=1; i<=5; i++){
        //     if(i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // System.out.print("i am out if the loop");



        // do {
        //     System.out.print("enter number : ");
        //     int n = sc.nextInt();

        //     if ( n % 10 == 0){
        //         continue;
        //     }

        //     System.out.println(n);
        // }
        // while (true);




        // prime number

        // System.out.print("enter a number : ");
        // int n = sc.nextInt();

        // boolean isprime = true;

        // if(n <= 1){
        //     isprime = false;
        // }
        // else if(n == 2){
        //     System.out.print(n + " is a Prime number");
        // } else {
        //  for(int i=2; i<=n-1; i++){
        //     if(n % i == 0){  // n is a multiple of i (i not equal to 1 or n)
        //         isprime = false;
        //         break;
        //     }
        //  }
        // }

        // if(isprime == true){
        //  System.out.print(n + " is a Prime number");
        //  } else {
        //     System.out.print(n + " is not a Prime number");
        //  }





        // optimised version of prime number

        System.out.print("enter a number : ");
        int n = sc.nextInt();

        boolean isprime = true;

        if(n <= 1){
            isprime = false;
        }
        else if(n == 2){
            System.out.print(n + " is a Prime number");
        } else {
         for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){  // n is a multiple of i (i not equal to 1 or n)
                isprime = false;
                break;
            }
         }
        }

        if(isprime == true){
         System.out.print(n + " is a Prime number");
         } else {
            System.out.print(n + " is not a Prime number");
         }



    }
}