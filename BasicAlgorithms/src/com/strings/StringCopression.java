package com.strings;
public class StringCopression {

	/**
	 * @param args
	 * Input:
	* ["a","a","b","b","c","c","c"]
	*
	* Output:
	* Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
	*
	*https://leetcode.com/problems/string-compression/
	 */
	//TC: O(n)
	//SC: O(n)
	public String compress(String input){
		StringBuffer stringBuffer = new StringBuffer();
		char last = input.charAt(0);
		int count =1;
		for(int i=1; i<input.length();i++){
			if(input.charAt(i)==last){
				count++;
			}else{
				stringBuffer.append(last);
				stringBuffer.append(count);
				last = input.charAt(i);
				count =1;
				//System.out.println("String:"+sb.toString());
			}
		}
		stringBuffer.append(last);
		stringBuffer.append(count);
		
		return stringBuffer.toString();
	}
	// if input string is smaller than compressed string then return original string
	public String compRight(String s){
		String newStr= this.compress(s);
		if(s.length() < newStr.length())
			return s;
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCopression comp = new StringCopression();
		System.out.println(comp.compRight("abccddae"));

	}

}
