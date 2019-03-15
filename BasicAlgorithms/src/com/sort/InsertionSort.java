package com.sort;

public class InsertionSort {

	//TC: O(n^2)
	//SC: O(1)
	public static void insertionSort(int [] nums) {
		int temp=0;
		int j=0;
		for(int i=1;i<nums.length;i++) {
			temp = nums[i];
			j=i-1;
			// move elements of array that are greater than key 
			// to the one position ahead of current position
			while(j>=0 && nums[j]>temp) {
				nums[j+1]=nums[j];
				j=j-1;
			}
			nums[j+1]=temp;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,3,2,1,1,5};
		insertionSort(nums);

	}

}
