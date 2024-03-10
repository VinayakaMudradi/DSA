// Check if the string is palindrome or not.

public class Palindrome {
    private String str;

    public Palindrome(String str){
        this.str = str;
    }

    public boolean isPalindrome(){
        boolean isPalindrome = true;
        if(str != null){
            int i=0;
            int j=this.str.length()-1;
            while(i<j){
                if(str.charAt(i) == str.charAt(j)){
                    i++;
                    j--;
                    continue;
                }
                isPalindrome = false;
                break;
            }
            return isPalindrome;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome("ABCBA");
        System.out.println(palindrome.isPalindrome());
    }
}
