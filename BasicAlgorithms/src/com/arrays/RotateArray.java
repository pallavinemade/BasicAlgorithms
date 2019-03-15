package com.arrays;
/*
 * rotate array till given index
 * https://leetcode.com/problems/rotate-array/description/
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Steps will be
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {

	//Brute Force 
	// O(n^2)
	public static void rotate(int[] nums, int rotationIndex) {
       
		int temp =0;
        for(int i =0; i< rotationIndex;i++){
        	int prev = nums[nums.length-1];
        	for(int j =0 ;j< nums.length;j++){
        		temp = nums[j];
        		nums[j] = prev;
        		prev = temp;
        		System.out.println(nums[j]);	
        	}
        }
      
	}
	
	//Better Approach 
	//O(n)
	/*
	 * Old        new 
	 *	0.         (0+2)%5 = 2
	 *	1          (1+2)%5 = 3
	 *	2          (2+2) %5 =4
	 *	3          (3+2)%5 = 0 
	 *	4.         (4+2)%5.  =1
	 */
	public static int[] rotateArray(int[] nums, int rotationIndex) {
        int[] rotatedArray = new int[nums.length];
        // new index based on % 
        for (int i = 0; i < nums.length; i++) {
        	System.out.println("index:"+(i + rotationIndex) % nums.length);
        	rotatedArray[(i + rotationIndex) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(rotatedArray[i]);
        }
        return rotatedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};  //{-1,-100,3,99};
		//rotate(nums,3);
		rotateArray(nums,2);
	}

}
