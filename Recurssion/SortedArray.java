// Check if the given array is sorted or not - increasing order

public class SortedArray {

    boolean isSorted(int[] array, int index){
        if(index == array.length-1){
            return true;
        }
        if(array[index] < array[index+1]){
            return isSorted(array, index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        SortedArray sortedArray = new SortedArray();
        System.out.println(sortedArray.isSorted(array, 0));
    }
}
