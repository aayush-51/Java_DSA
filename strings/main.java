package strings;
import java.util.*;

public class main {
    public static void printLetters (String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }


    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i =0; i<path.length(); i++){
            char dir = path.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            //South
            else if(dir == 'S'){
                y--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }

        int x2 = x*x, y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static String subString (String str, int si, int ei){
        String substring = "";
        for(int i = si; i<ei; i++){
            substring += str.charAt(i);
        }

        return substring;
    }


    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String args[]){
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@#1234");

        // strings are Immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());
    
        //concatenation
        // String firstName = "Aayush", middleName = "Kumar", lastname = "Gupta";

        // String fullName = firstName + " " + middleName + " " + lastname;
        // System.out.println(fullName);

        // printLetters(fullName);


        //check if a String is a Palindrome
        
        // String str = "madam";
        // System.out.println(isPalindrome(str));

        //shortest path
        // String path = "WNEENESENNN";
        // String path = "NS";

        // System.out.println(getShortestPath(path));

        //String Function - Compare

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1 == s2){
        //     System.out.println("String are equal"); // beacuse in this case s2 is pointing to s1, any new string is not created while s2 is created.
        // } else {
        //     System.out.println("String are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("String are not equal"); // beacuse from this new keyword a new string tony is created in the memory. in this case equality is checked in object level.
        // }
        
        
        // if(s1.equals(s3)) {
        //     System.out.println("String are equal"); // beacuse in this case value is equal or not was checked. 
        // } else {
        //     System.out.println("String are not equal");
        // }


        //Substring

        // String str = "HelloWorld";

        // System.out.println(subString(str, 0, 5));


        //print largest string - lexicographically

        // String fruits[] = {"apple", "mango", "banana", "papaya"};

        // String largest = fruits[0];
        // for(int i = 1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i]) < 0){ 
        //         largest = fruits[i];
        //     }
        // }

        // Note:- str1.compareTo(str2) ->  0 (strings are equal)
        //                                -ve  < 0 (str1 < str2)
        //                                +ve  > 0 (Str1 > str2)
    
        // System.out.println(largest);


        // StringBuilder

        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a'; ch<='z'; ch++){
        //     sb.append(ch);
        // }

        // System.out.println(sb);


        // For a given String convert each the first letter of each word to uppercase

        // String str = "hi, i am aayush kumar gupta";

        // System.out.println(toUpperCase(str));


        
        






    }
}
