// Given array and K, find first occurance of K in array

public class FirstOccurance {

    public int firstOccurance(int[] array, int index, int K){
        if(index == array.length){
            return -1;
        }
        if(array[index] == K){
            return index;
        }
        else{
            return firstOccurance(array, index+1, K);
        }
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 40, 50, 70};
        FirstOccurance firstOccurance = new FirstOccurance();
        System.out.println(firstOccurance.firstOccurance(array, 0, 170));
    }
}
