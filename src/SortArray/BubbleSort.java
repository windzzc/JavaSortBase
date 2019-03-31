package SortArray;

import java.util.Arrays;
/*
冒泡排序：
从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
 */
public class BubbleSort {
    public static void bubbleSort(int[] nums){
        int length = nums.length;
        boolean sorted = false;
        for(int i= length-1;i>0 && !sorted;i--){
            sorted =true;
            for(int j=0;j<i;j++){
                if(nums[j+1]<nums[j]){
                    sorted=false;
                    swap(nums,j,j+1);
                }

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
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
