
// The largest element in the array should be atleast twice of the rest of all elements in the array

public class LargestElementTwice {
    private int[] array = {10, 30, 40, 50, 160};
    private int largest = Integer.MIN_VALUE;
    private int secondLargest = Integer.MIN_VALUE;

    private void getLargestAndSecondLargest(){
        for(int i=0; i<this.array.length; i++){
            if(this.array[i] > largest){
                this.secondLargest = this.largest;
                this.largest = this.array[i];
            }
            else if(this.array[i] > secondLargest){
                this.secondLargest = this.array[i];
            }
        }
    }

    public boolean largestElementTwice(){
        this.getLargestAndSecondLargest();
        if(this.secondLargest*2 <= this.largest){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        LargestElementTwice largestElementTwice = new LargestElementTwice();
        System.out.println(largestElementTwice.largestElementTwice());
    }
}
