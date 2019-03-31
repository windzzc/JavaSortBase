package SortArray;

import java.util.Arrays;

/*
希尔排序的出现就是为了解决插入排序的这种局限性，它通过交换不相邻的元素，每次可以将逆序数量减少大于 1。
 */
public class ShellSort {
    public static void shellSort(int[] nums){
        int length = nums.length;
        int h=1;
        while(h<length/3){
            h=3*h+1;
        }
        while(h>=1){
            for(int i=h;i<length;i++){
                for(int j=i;j>=h&&nums[j]<nums[j-h];j -= h){
                    swap(nums,j,j-h);
                }
            }
            h=h/3;
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int [] a = new int[]{1,8,9,3,0};
        shellSort(a);
        //selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
