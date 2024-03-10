// This takes 2 input and swap the elements in those 2 indices.
public class SwapTwoIndex {
    private int[] array = {10, 20, 30, 40, 50};

    public void swapTwoIndexElement(int index1, int index2){
        if(index1 >= 0 && index1 <= this.array.length-1 && index2 >= 0 && index2 <= this.array.length-1 && index1 != index2){
            int temp = this.array[index1];
            this.array[index1] = this.array[index2];
            this.array[index2] = temp;
        }
    }

    public void printArray(){
        for(int i=0; i<this.array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        SwapTwoIndex swapTwoIndex = new SwapTwoIndex();
        swapTwoIndex.swapTwoIndexElement(0, 4);
        swapTwoIndex.printArray();
    }
}
