package com.maths;

import java.util.ArrayList;
import java.util.List;
/*
 * Write a program that outputs the string representation of numbers from 1 to n.

 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static List<String> fizzBuzz(int n) {
        List<String> li = new ArrayList<String>();
        for(int i =1; i<=n ;i++){

            if(i%3==0 && i%5==0){
                li.add("FizzBuzz");
            }else if(i%3==0){
                 li.add("Fizz");
            }else if(i%5==0){
                 li.add("Buzz");
            }else{	
                 String a = String.valueOf(i);
                 li.add(a);
            }

        }
        return li;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(15));
	}

}
