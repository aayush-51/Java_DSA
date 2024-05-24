import java.util.*;

public class main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // int age = 16;

        // if(age >= 18){
        //     System.out.println("adult : Vote , Drive");
        // }


        // if(age > 13 && age <= 18){
        //     System.out.println("teenager");
        // }

        // else{
        //     System.out.println("not adult");
        // }


        // int a = 1, b =3;

        // if(a >= b){
        //     System.out.println("largest of two is : a ");
        // }else {
        //     System.out.println("largest of two is : b ");
        // }



        // System.out.print("Enter your number : ");
        // int num = sc.nextInt();

        // if(num % 2 == 0){
        //     System.out.println(num + " is even");
        // } else {
        //     System.out.println(num + " is odd");
        // }



        // int age = 13;

        // if(age >= 18) {
        //     System.out.println("adult");
        // }
        // else if(age >= 13 && age < 18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("child");
        // }




        // Income tax calculator

        // System.out.print("Enter your income : ");
        // int income = sc.nextInt();
        // int tax;

        // if(income < 500000){
        //     tax = 0;
        // }
        // else if (income >= 500000 && income < 1000000){
        //     tax = (int) (income * 0.2);
        // }
        // else {
        //     tax = (int) (income * 0.3);
        // }

        // System.out.print("your tax is  : " + tax);



        // largest of 3


        // int a = 1, b = 3, c = 6;

        // if ( (a >=b) && (a >= c) ){
        //     System.out.print("largest is a");
        // }
        // else if ( b >= c ){
        //     System.out.print("largest is b");
        // }
        // else {
        //     System.out.print("largest is c");
        // }





        // Ternary Operator

        // int larger;
        // System.out.println(larger = (5 > 3)?5:3);

        // int number = 4;

        // String type = ((number % 2) == 0) ? "even" : "odd" ;
        // System.out.print(type);


        // pass or fail

        // int marks = 32;

        // String result = (marks >= 33)? "Pass" : "fail" ;
        // System.out.print(result);




        // Switch Statement

        // int number = 5;
        // char ch = 'a';

        // switch(ch){
        //     case 'a' : System.out.println("samosa");
        //                break;
        //     case 'b' : System.out.println("burger");
        //                break;
        //     case 'c' : System.out.println("mango shake");
        //                break;
        //     default : System.out.println("we wake up");
        // }




        // calculator


        System.out.print("enter a : ");
        int a = sc.nextInt();

        System.out.print("enter b : ");
        int b = sc.nextInt();

        System.out.print("which operation you want to perform : '+' , '*' , '-' , '/' , '%' : ");
        char operator = sc.next().charAt(0);


        switch(operator){

            case '+' : System.out.print(a+b);
                       break;
            case '-' : System.out.print(a-b);
                       break;
            case '*' : System.out.print(a*b);
                       break;
            case '/' : System.out.print(a/b);
                       break;
            case '%' : System.out.print(a%b);
                       break;
            default :  System.out.print("Wrong operator");
        }






    }
}