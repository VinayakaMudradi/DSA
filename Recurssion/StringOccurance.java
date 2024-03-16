// Occurance of "aaa" in a given string
// 1) Overlapping is allowed
// 2) Overlapping is not allowed

public class StringOccurance {

    // Overlapping is allowed
    public int countTargetStringWithOverlapping(String str){
        if(str.length() < 3){
            return 0;
        }
        int temp = countTargetStringWithOverlapping(str.substring(1, str.length()));
        if(str.substring(0, 3).equals("aaa")){
            return 1+temp;
        }
        else{
            return temp;
        }
    }

    // Overlapping is not allowed
    public int countTargetStringWithoutOverlapping(String str){
        if(str.length() < 3){
            return 0;
        }
        if(str.substring(0, 3).equals("aaa")){
            return 1+countTargetStringWithoutOverlapping(str.substring(3, str.length()));
        }
        else{
            return countTargetStringWithoutOverlapping(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        StringOccurance stringOccurance = new StringOccurance();
        System.out.println(stringOccurance.countTargetStringWithOverlapping("aaaabaaa"));
        System.out.println(stringOccurance.countTargetStringWithoutOverlapping("aaaabaaa"));
    }
    
}
