package com.sort;

public class BubbleSort {

	//TC: O(n^2)
	//SC : O(1)
	public static void bubbleSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,3,2,1,1,5};
		bubbleSort(nums);

	}

}
