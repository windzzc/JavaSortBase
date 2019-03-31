package SortArray;

import java.util.Arrays;

public class InsertSort {
    /*
    插入排序：
    每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。
     */
    public static void insertSort(int[] nums){
        int length = nums.length;
        for(int i=1;i<length;i++){
            for(int j=i;j>0&&nums[j]<nums[j-1];j--){
                swap(nums,j,j-1);
            }
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int [] a = new int[]{1,8,9,3,0};
        //bubbleSort(a);
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
}
