package methods;
import java.util.*;

public class methods {

    // user defined methods

    public static void printhelloworld (){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static int calculatesum(int num1, int num2) { //  num1 & num2 are parameters // formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;

    }


    public static int factorial(int n){
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }


    public static int bincoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);

        int nmr_fact = factorial(n - r);

        int bincoeff = n_fact / (r_fact * nmr_fact);
        return bincoeff;
    }




    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b +c;
    }

    public static float sum(float a, float b){
        return a + b;
    }



    // only for n >= 2
    // public static boolean isPrime(int n){
    //     // corner cases
    //     // 2
    //     if(n == 2){
    //         return true;
    //     }

    //     for(int i=2; i<=n-1; i++){
    //         if(n % i == 0){ //completely dividing
    //             return false;
    //         }
    //     }

    //     return true;
    // }



    public static boolean isPrime(int n){
        // corner cases
        // 2
        if(n == 2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){ //completely dividing
                return false;
            }
        }

        return true;
    }


    public static void PrimesinRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }



    public static void bintoDec(int binNum){
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.print("decimal of " + mynum + " = " + decNum);
    }



    public static void dectoBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n/= 2;
        }

        System.out.print("binary form of " + myNum + " = " + binNum);
    }

    public static void printS() {
        int s = 45;
    }

    public static void main(String args[]){

        // method scope
        // System.out.println(s);  // give error :-  s cannot be resolved to a variable

        Scanner sc = new Scanner(System.in); // inbuit method example sc.nextInt()

        // printhelloworld(); //function call

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int result = calculatesum(a,b); // a & b are arguments or actual parameters
        // System.out.println("sum is : " + result);


        // swap

        // int a = 5;
        // int b = 10;
        // swap(a,b);

        // System.out.println("a is : " + a);
        // System.out.println("b is : " + b);



        // product of a & b

        // int a = 3;
        // int b = 5;
        // int prod = multiply(a,b);
        // System.out.println("a * b = " + prod);
        // prod = multiply(10,20);
        // System.out.println("a * b = " + prod);




        // factorial of a number
        // int fact = factorial(4);
        // System.out.println("factorial is : " + fact);

        // System.out.println(factorial(7));



        // binomial coefficient

        // System.out.println(bincoeff(5, 2));



        // funtion overloading

        // using parameters
        // System.out.println(sum(3,5));
        // System.out.println(sum(5,2,1));

        // using data types
        // System.out.println(sum(4.8f,3.2f));



        // prime number or not

        // System.out.println(isPrime(113));


        // print all primes in a range

         PrimesinRange(100);



        // binary to decimal
        //bintoDec(111);


        // decimal to binary
        // dectoBin(15);



        // block scope

        // int p = 10;

        // {  // block scope
        //     int b = 5;
        //     System.out.print(b); // 5
        //     System.out.print(p); // 10
        // }

        // System.out.print(b); // give error :-  b cannot be resolved to a variable

        // System.out.print(p); // 10


        // for(int i=1; i<=5; i++){

        // }

        // System.out.print(i); // give error :-  i cannot be resolved to a variable




        // method scope

        // variable defined inside a function or method

        // System.out.print(s);  // give error :-  s cannot be resolved to a variable
        // int s = 45;
        // System.out.print(s);  // 45



    }
    
}
