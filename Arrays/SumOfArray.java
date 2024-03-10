// This takes the input from the user and calculates the sum of all the elements in the array

import java.util.Scanner;

public class SumOfArray {
    private int[] array;

    public SumOfArray(int size){
        this.array = new int[size];
    }

    public void populateArray(){
        if(this.isArrayCreated()){
            Scanner scanner = new Scanner(System.in);
            for(int i=0; i<this.array.length; i++){
                this.array[i] = scanner.nextInt();
            }
        }
        else{
            System.out.println("Create array of size N.");
        }
    }

    private boolean isArrayCreated(){
        if(this.array != null){
            return true;
        }
        return false;
    }

    public int sumOfArray(){
        int sum = 0;
        if(this.isArrayCreated()){
            for(int i=0; i<this.array.length; i++){
                sum = sum+this.array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        SumOfArray sumOfArray = new SumOfArray(5);
        sumOfArray.populateArray();
        System.out.println(sumOfArray.sumOfArray());
    }
    
}
