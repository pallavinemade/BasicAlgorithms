

package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {

	/**
	 * 
	 * From array  search 2 numbers with sum as given target and return index
	 * example : [1,2,4,4]  - target 8   : True
	 * [1,2,3,9] - target 8  :False
	 * 
	 *
	 */
	    
	// Time complexity : O(n^2)
	// Space complexity : O(1)
		public int[] twoSum(int[] nums, int target) {
	        
	        for(int i =0 ; i< nums.length;i++){
	            for (int j=0 ; j< nums.length; j++){
	                if(nums[i] + nums[j] == target){
	                    int [] temp ={i,j};
	                    return temp;
	                }
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
		
		// Time complexity : O(nlogn)
		// Space complexity : O(n)
	    
		public boolean twoSumBetter(int[] nums, int target) {
	    	Arrays.sort(nums);  // O(log n)
	    	int startP=0;
	    	int endP=nums.length-1;
	    	while(startP<=endP) {
	    		if(nums[startP]+nums[endP]<target) {
	    			startP=startP+1;
	    		}else if(nums[startP]+nums[endP]>target) {
	    			endP=endP-1;
	    		}else {
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    // Reduced complexity 
	    // get the difference and save number in map check for difference present then add index
	    // Time complexity : O(n)
	 	// Space complexity : O(n)
	    
	    public int[] newtwoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	        	if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i };
	            }
	            map.put(nums[i], i);
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers add = new AddTwoNumbers();
		int[] nums = {1,2,4,4};  //{1,2,3,9}
		int target = 8;
		
//		int[] ans= add.newtwoSum(nums, target);
//		if(ans.length >0){
//			for(int i =0; i<ans.length;i++){
//				System.out.println(ans[i]);
//			}
//		}else{
//			System.out.println("No match found!!!");
//		}
	
		System.out.println(add.newtwoSum(nums, target));
	}

}
