package com.sort;

public class SelectionSorting {
	//TC: O(n^2)
	//SC : O(1)
	//select the smallest item and swap[ with smallets item
	public static void selectionSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			//set index as min
			int min=i;
			int temp = nums[i];
			for(int j=i+1;j<nums.length;j++) {
				//update min if curr is min if what we have previously
				if(nums[j]<nums[min]) {
					min=j;
				}	
			}
			nums[i]=nums[min];
			nums[min]=temp;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,3,2,1,1,5};
		selectionSort(nums);

	}

}
