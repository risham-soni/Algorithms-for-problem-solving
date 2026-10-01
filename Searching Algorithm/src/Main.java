// Linear Search TC - o(n)
/*
class Main{
    public static int f(int[] arr, int key){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {4,8,2,6,3,7,9};
        int key = 5;
        System.out.println(f(arr, key));
    }
}
*/

// Binary Search TC - o(log n)
/*
class Main{
    public static int f(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {2, 6, 7, 9, 11, 15};
        int key = 11;
        System.out.println(f(arr, key));
    }
}
*/
