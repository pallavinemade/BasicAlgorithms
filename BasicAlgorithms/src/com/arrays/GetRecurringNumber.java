package com.arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

// Get the recurring or most repeated number in an array
// [2,5,1,2,3,5,1,2,4]  return 2
// [2,1,1,2,3,5,1,2,4] return 1 not 2
// brute force
// nested loops i=0 and j=i+1 	if(a[i]==a[j]) return a[i] end return undefined 

public class GetRecurringNumber {

	
	public static int getRepeatedNumber(int[] nums) {
		// for sorted keys
		TreeMap< Integer, Integer> map = new TreeMap<Integer, Integer>();
		if(nums==null || nums.length==0) {
			 throw new IllegalArgumentException("No two sum solution");
		}
		for(int num : nums) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		 
		 int key=0; 
		 int max=Integer.MIN_VALUE;
		  for(Entry<Integer, Integer> e: map.entrySet()) {
			  System.out.println("Key:"+e.getKey() + " Value:"+e.getValue());
		  	  if(max<e.getValue()) {
		  		  max= e.getValue();
		  		  key= e.getKey(); 
		  	  }
		  }
		System.out.println("Max:"+max);
		return key;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-5,-5,2,2,3,-5,1,2,4};
		System.out.println("Repeated int :"+getRepeatedNumber(nums))	;
	}

}
