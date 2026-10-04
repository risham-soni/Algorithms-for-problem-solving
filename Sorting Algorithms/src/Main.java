//Bubble Sort
/*
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
*/

// Selection Sort
/*
class Main{
    static void f(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    static void printArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original Array");
        printArr(arr);
        System.out.println("Sorted Array");
        f(arr);
        printArr(arr);
    }
}
*/

// Insertion Sort TC - o(n^2)
class Main{
    static void sort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {12, 11, 13, 5, 6};

    }
}