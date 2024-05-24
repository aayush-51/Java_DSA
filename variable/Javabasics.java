import java.util.*;
public class Javabasics{
    public static void main(String[] args) {
        //System.out.print("hello World\nHello \n  World");
        // System.out.print("hello World\n");
        // System.out.print("hello World\n");

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10;
        // int b = 5;

        // System.out.println(a);
        // System.out.println(b);

        // String name = "Tony Stark";
        // System.out.println(name);

        // a = b;
        // System.out.println(a);


        //primitive data types

        // byte b = 8;
        // System.out.println(b);

        // char ch = 'a';
        // System.out.println(ch);

        // boolean var = true;

        // float price = 10.5f;

        // int number = 25;

        // //long
        // //double

        // short n = 240;

        ///////////////////////////////////

        // code to calculate sum
        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);
        


        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // boolean var = sc.nextBoolean();
        // System.out.println(var);

        // short sh = sc.nextShort();
        // System.out.println(sh);

        // long num = sc.nextLong();
        // System.out.println(num);




        // Sum of 2 num

        // System.out.print("Enter 1st num : ");
        // int a = sc.nextInt();

        // System.out.print("Enter 2nd num : ");
        // int b = sc.nextInt();

        // int sum = a + b;
        // System.out.print("sum is : " + sum);

        //product of 2 num

        // System.out.print("Enter 1st num : ");
        // int a = sc.nextInt();

        // System.out.print("Enter 2nd num : ");
        // int b = sc.nextInt();

        // int product = a * b;
        // System.out.print("product is : " + product);



        //Area of a circle

        // System.out.print("Enter radius : ");
        // float r = sc.nextInt();
        // float area = 3.14f * r * r;
        // System.out.print("area is : " + area);



        //Type conversion or widening conversion or implicit conversion

        // int a = 25;
        // long b = a;
        // System.out.print(b); //output is 25


        // long a = 25;
        // int b = a;
        // System.out.print(b); // output is error: incompatible types: possible lossy conversion from long to int
    
        // int number = sc.nextFloat();
        // System.out.print(number); //output is error: incompatible types: possible lossy conversion from float to int

        // float number = sc.nextInt();
        // System.out.print(number); //output is 16
        //                                     //16.0


        // char ch = 'a';
        // char ch2 = 'b';
        // int number = ch;
        // int number2 = ch2;
        // System.out.println(number);
        // System.out.println(number2);
    

        //Type casting or narrowing conversion or explicit conversion

        // float a = 25.12f;
        // int b = (int) a;
        // System.out.print(b); // output is 25


        // float marks = 99.999f;
        // int marks2 = (int) marks;
        // System.out.print(marks2); // output is 99



        // Type promotion

        // char a = 'a';
        // short b = 50;
        // System.out.println(a); // a
        // System.out.println((int)a); // 97
        // System.out.println(b); // 50
        // System.out.println(a + b); // 147


        // char a = 'a';
        // char b = 'b';
        // System.out.println(a);      // a
        // System.out.println((int)b); // 98
        // System.out.println((int)a); // 97
        // System.out.println(b - a);  // 1


        //char c = b - a; // error: incompatible types: possible lossy conversion from int to char


        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = a + b + c; // error: incompatible types: possible lossy conversion from int to byte


        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;

        // double ans = a + b + c + d;
        // System.out.println(ans);


          byte b = 5;
        // // b = b * 2; // error: incompatible types: possible lossy conversion from int to byte

        // byte a = b * 2; // error: incompatible types: possible lossy conversion from int to byte



        byte a = (byte) (b * 2);
        System.out.println(a);   // 10

        


    }
}
//boilerplate code