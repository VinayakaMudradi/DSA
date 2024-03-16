public class Palindrome {
    public boolean isPalindrome(String str){
        if(str.length() == 1 || str.length() == 0){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        else{
            return isPalindrome(str.substring(1, str.length()-1));
        }
    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("MALAYALAM"));
    }
    
}
