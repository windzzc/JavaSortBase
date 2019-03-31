package SortArray;

import java.util.Arrays;
//快速排序 复杂度 O（nlogn）
//为了防止数组最开始就是有序的，在进行快速排序时需要随机打乱数组。
public class QuickSort {
    //三切分快速排序针对于原始数据类型，针对于引用类型使用归并排序
    //将数组划分为大于、等于、小于key的三部分
    public static void threeQuickSort(int[] nums,int low,int high){
        if(low>=high) return;
        int start = low;
        int end =high;
        int i= low+1;
        int key = nums[low];
        while(i<=end){
            if(nums[i]<key){
                swap(nums,start,i);
                i++;
                start++;
            }
            else if(nums[i]>key){
                swap(nums,i,end);
                end--;
            }
            else{
                i++;
            }
        }
        threeQuickSort(nums,low,start-1);
        threeQuickSort(nums,end+1,high);
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void quickSort(int[] nums,int low,int high){
        int start = low;
        int end = high;
        int key = nums[low];
        while(end>start){
            while(end>start&&nums[end]>=key){
                end--;
            }
            if(nums[end]<=key){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start]=temp;
            }
            while(end>start&&nums[start]<=key){
                start++;
            }
            if(nums[start]>=key){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] =temp;
            }
        }
        if(start>low) quickSort(nums,low,start-1);
        if(end<high) quickSort(nums,end+1,high);
    }


//    public static void swap(int[] nums,int i,int j){
//        int temp=nums[i];
//        nums[i]=nums[j];
//        nums[j]=temp;
//    }

    public static void main(String[] args) {
        int [] a = new int[]{1,8,9,3,0};
        threeQuickSort(a,0,a.length-1);
        //shellSort(a);
        //selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
