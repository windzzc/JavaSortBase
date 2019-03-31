package SortArray;

import java.util.Arrays;

//import static SortArray.QuickSort.swap;

public class HeapSort {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sink(int[] nums,int k,int N){

        while(2*k<=N){
            int j=2*k;
            if(j<N&&nums[j]<nums[j+1])
                j++;
            if(nums[k]>nums[j]) break;
            swap(nums,k,j);
            k=j;
        }
    }
    public static void heapSort(int[] nums){
        int N =nums.length-1;
        for(int i=N/2;i>=1;i--){
            sink(nums,i,N);
        }
        while(N>1){
            swap(nums,1,N--);
            sink(nums,1,N);
        }

    }
    public static void main(String[] args) {
        int [] a = new int[]{1,8,9,3,0};
        //shellSort(a);
        //selectSort(a);
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }

}
