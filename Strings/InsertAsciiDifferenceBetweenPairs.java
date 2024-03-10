// Insert ascii difference between pair of charecters a-1b-1c
public class InsertAsciiDifferenceBetweenPairs{
    private String str;

    public InsertAsciiDifferenceBetweenPairs(String str){
        this.str = str;
    }

    private int asciiDifference(char firstCharecter, char secondCharecter){
        return firstCharecter - secondCharecter;
    }

    public void insertAsciiDifference(){
        String result = "";
        int startingInex = 0;
        while(startingInex <= str.length()-2){
            int asciiDifference = this.asciiDifference(str.charAt(startingInex), str.charAt(startingInex+1));
            result = result + str.charAt(startingInex) + asciiDifference;
            startingInex++;
        }
        result = result + str.charAt(startingInex);
        str = result;
        System.out.println(str);
    }

    public static void main(String[] args) {
        InsertAsciiDifferenceBetweenPairs insertAsciiDifferenceBetweenPairs = new InsertAsciiDifferenceBetweenPairs("abc");
        insertAsciiDifferenceBetweenPairs.insertAsciiDifference();
    }
}
