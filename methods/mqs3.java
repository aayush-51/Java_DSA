public class mqs3 {

    public static void isPalindrome(int n){
        int realnum= n;
        int revsNum = 0;

        while(n > 0){
            int lastdigit = n % 10;
            revsNum = (revsNum * 10) + lastdigit;
            n = n / 10;
        }

        if(realnum == revsNum){
            System.out.println(realnum + " is a palindrome");
        }
        else {
            System.out.println(realnum + " is not a palindrome");
        }
    }
    
    public static void main(String args[]){

        isPalindrome(121);
    }
}
