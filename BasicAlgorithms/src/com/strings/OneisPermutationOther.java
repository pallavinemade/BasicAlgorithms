package com.strings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OneisPermutationOther {

	/**
	 * @param args
	 */
	// Java default sort method used hence 
	//TC: O(NlogN)
	// SC: O(N)
	public String sort(String inputStr){
		char[] str = inputStr.toCharArray();
		Arrays.sort(str);
		return new String(str);
	}
	public boolean isPermutation(String input1 , String input2){
		if(input1.length() != input2.length()){
			return false;
		}
		return (sort(input1).equals(sort(input2)));
	}
	// Another approach using ASCII
	// TC:O(N)
	// SC: O(N)
	public boolean permunation(String inputStr1, String inputStr2){
		if(inputStr1.length() != inputStr2.length()){
			return false;
		}
		int [] letters = new int[128];
		char[] charArray = inputStr1.toCharArray();
		for(char token:charArray ){
			letters[token]++;
			}
		for(int i=0; i<inputStr2.length();i++){
			int token = (int) inputStr2.charAt(i);
			if(--letters[token]<0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneisPermutationOther check = new OneisPermutationOther();
		String s1="ABBC";
		String s2="BCAB";
		System.out.println(check.permunation(s1,s2));
		
	}

}
