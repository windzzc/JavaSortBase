package SortArray;

import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int[] nums){
        int length = nums.length;
        for(int i=0;i<length;i++){
            int min = i;
            for(int j=i+1;j<length;j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
            }
            swap(nums,i,min);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int [] a = new int[]{1,8,9,3,0};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
