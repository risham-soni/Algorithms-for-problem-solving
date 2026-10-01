//Bubble Sort
import java.util.Arrays;
class Main{
    public static int[] f(int[] arr){
        for(int turn = 0; turn < arr.length-1; turn++){
            for(int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr = {5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(f(arr)));
    }
}