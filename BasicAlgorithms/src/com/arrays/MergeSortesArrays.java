package com.arrays;

import java.util.ArrayList;

//two arrays  [0,3,4,31]  [4,6,30]
// solution [0,3,4,4,6,30,31]
//Can be done with nested for loos with O(n^2)
// Below solution is for O(n)
public class MergeSortesArrays {

	
	public static ArrayList<Integer> merge(int[] arr1 , int[] arr2) {
			
			ArrayList<Integer> mergedArray= new ArrayList<Integer>(); 
			int arr1Len = arr1.length;
			int arr2Len = arr2.length;
			// use static array  
			//int[] mergedArray1 = new int[arr1Len+arr2Len];
			// check preconditions
			//			if(arr1.length==0) {
			//				return arr2;
			//			}
			//			if(arr1.length==0) {
			//				return arr2;
			//			}
	
			int i=0;
			int j =0;
			while(i<arr1Len && j<arr2Len ) {
				System.out.println(arr1[i]+ " " +arr2[j] );
				if(arr1[i] < arr2[j]) {
					mergedArray.add(arr1[i]);
					i++;
				}else {
					mergedArray.add(arr2[j]);
					j++;
				}
			System.out.println("Merged Array: "+mergedArray.toString());
			}
			//These loops  add remaining array elements 	
			while(i < arr1Len) {
				mergedArray.add(arr1[i]);
				i++;
			}
			while(j<arr2Len) {
				mergedArray.add(arr2[j]);
				j++;
			}
			
			return mergedArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {0,3,4,31};
		int[] array2 = {4,6,30};
		System.out.println(merge(array1, array2));
	}

}
