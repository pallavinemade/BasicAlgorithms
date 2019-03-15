package com.strings;
/*
 *  Reverse the string for example
 *  Input: Let's take LeetCode contest
 *	 Output : tsetnoc edoCteeL ekat s'teL 
 *	 If Asked consider below scenarios 
 *	 convert to lower case
 *	 take case of special characters
 */
 
public class ReverseWordsInStr {
	
	public String reverseLine(String s) {
		if(s!=null) {
			String [] str = s.split(" ");
			StringBuffer strB = new StringBuffer();
			//another approach 
			/*
			 * int len = s.length();
			 * for(int i = len -1; i >=0 ; i--) {
			 * char a =s.charAt(i); strB.append(a);
			 * }
			 * return strB.toString();
			 */
			
			for(int i =str.length-1; i>=0; i--){
				str[i] = reverseStr(str[i]);
				System.out.println(str[i]);
				strB.append(str[i]);
				strB.append(" ");
			}
			return strB.toString();
		}else {
			throw new IllegalArgumentException("Null String!!!");
		}
    }
	public String reverseStr(String s){
			if(s!=null) {
				char [] ch = s.toCharArray();
				int len = ch.length;
				for(int i=0; i<len/2 ;i++){
					char temp = ch[i];
					ch[i] = ch[len-1-i];
					ch[len-1-i] = temp;
				}
				//return String.valueOf(ch);
				return new String(ch);
			}else {
				throw new IllegalArgumentException("Null String!!!");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInStr revrese = new ReverseWordsInStr();
		System.out.println("Let's take LeetCode contest : "
				+revrese.reverseLine("Let's take LeetCode contest"));

	}

}
