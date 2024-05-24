import java.util.*;


public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    
// Arithmetic Operators


        // Binary operstors

        /* 
        int A = 10;
        int B = 5;
        System.out.println("add = " + (A+B));
        System.out.println("substract = " + (A-B));
        System.out.println("multiply = " + (A*B));
        System.out.println("divide = " + (A/B));
        System.out.println("remainder(modulo) = " + (A%B));
        */


        // Unary operators

        // int a = 10;
        // int b = ++a;
        // System.out.println(a); // 11
        // System.out.println(b); // 11

        // int a = 10;
        // int b = a++;
        // System.out.println(a); // 11
        // System.out.println(b); // 10


        // int a = 10;
        // int b = --a;
        // System.out.println(a); // 9
        // System.out.println(b); // 9

        // int a = 10;
        // int b = a--;
        // System.out.println(a); // 9
        // System.out.println(b); // 10



// relational opertors


        // == operator

        // int a = 10;
        // int b = 5;
        // System.out.println( a == b); // false

        // int a = 10;
        // int b = 10;
        // System.out.println( a == b); // true



        // != operator

        // int a = 10;
        // int b = 5;
        // System.out.println( a != b); // true

        // int a = 10;
        // int b = 10;
        // System.out.println( a != b); // false



        // > & < operator

        // int a = 10;
        // int b = 5;
        // System.out.println( a > b); // true


        // int a = 10;
        // int b = 5;
        // System.out.println( a < b ); // false


        // int a = 10;
        // int b = 10;
        // System.out.println( a < b); // false

        // int a = 10;
        // int b = 10;
        // System.out.println( a <= b); // true





// Logical operators



        // logical AND -> &&

        System.out.println( (3>2) && (5>0) ); // true

        System.out.println( (3<2) && (5>0) ); // false

        System.out.println( (3>2) && (5<0) ); // false

        System.out.println( (3<2) && (5<0) ); // false



        // logicasl OR -> ||

        System.out.println( (3<2) || (5<0) ); // false

        System.out.println( (3>2) || (5<0) ); // true

        System.out.println( (3<2) || (5>0) ); // true

        System.out.println( (3>2) || (5>0) ); // true



        // logical NOT -> !

        System.out.println( !(3>2) ); // false

        System.out.println( !(0>5) ); // true





// Assignment operators


        int A = 10;
        
        // A = A + 10; // 20

        A += 10; // 20

        System.out.println(A);


        int B = 5;

        // B = B - 5; // 0

        // B -= 5; // 0

        // B *= 5; // 25

        // B /= 5; // 1

        B %= 5;

        System.out.println(B);

    }
    
}
