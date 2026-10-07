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

