//Traversal - o(n)
/*
class Main{
    public static void main(String args[]){
        int[] arr = {3, 9, 1, 7, 4};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
*/

import java.util.Arrays;

//Two Pointer
/*
class Main{
    public static int[] f(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int currSum = nums[left] + nums[right];
            if(currSum == target){
                return new int[] {left, right};
            }
            if(currSum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {};
    }
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target = 18;
        //output [0, 1]
        int[] result = f(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
*/

//Prefix Sum
/*
class Main{
    public static void main(String args[]){
        int[] arr = {2, 4, 1, 7, 3};
        int n = arr.length;
        int[] prefix = new int[n+1];

        for(int i = 0; i < n; i++){
            prefix[i+1] = prefix[i] + arr[i];
        }
        int left = 1;
        int right = 3;
        int rangesum = prefix[right+1] - prefix[left];
        System.out.println(Arrays.toString(prefix));
        System.out.println(rangesum);
    }
}
*/

/*
class Main{
    public static void main(String args[]){
        int[] arr = {2, 4, 1, 7, 3};
        int n = arr.length;
        int[] prefix = new int[n];
        for(int i = 1; i < n; i++){
            prefix[0] = arr[0];
            prefix[i] = arr[i] + prefix[i-1];
        }
        int left = 1;
        int right = 3;
        int rangeSum = prefix[right] - prefix[left-1];
        System.out.println(Arrays.toString(prefix));
        System.out.println(rangeSum);
    }
}
*/