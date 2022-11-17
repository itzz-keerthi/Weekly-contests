/* TASK
To check whether an expression is balanced or not without using the idea of stacks

Problem statement:
Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘       */

package hackerrank;

import java.util.*;
import java.lang.*;

class practice{  
public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	char left='(';
	char right=')';
	char left_sq='[';
	char right_sq=']';
	int l_count=0;int r_count=0;int lsq_count=0;int rsq_count=0;
	for(int i=0;i<input.length();i++) {
		if(input.charAt(i)==left) {
			l_count++;
		}
		else if(input.charAt(i)==right){
			r_count++;
		}
		else if(input.charAt(i)==left_sq) {
			lsq_count++;
		}
		else {
			rsq_count++;
		}
	}
	if((l_count==r_count) && (lsq_count==rsq_count)) {
		System.out.println("Balanced");
	}
	else {
		System.out.println("Not balanced");
	}
 }
}  

 
