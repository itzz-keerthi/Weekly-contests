/*TASK
Given string str containing only lowercase characters. The problem is to print the characters along with their frequency in the order of their occurrence and in the given format explained in the examples below.

Examples: 

Input : str = "muthuganesan"
Output : 
m:1
u:2
t:1
h:1
g:1
a:2
n:2
e:1
s:1                                                   */
package hackerrank;

import java.util.*;
import java.lang.*;

class practice{  
	static final int N=25;
	static void char_freq(String input) {
		int n=input.length();
		int freq[]=new int[N];  //hash table
		for(int i=0;i<n;i++) 
			freq[input.charAt(i)-'a']++;
		
		for(int i=0;i<n;i++) {
			if(freq[input.charAt(i)-'a']!=0) {
				System.out.println(input.charAt(i)+":"+freq[input.charAt(i)-'a']);
			}
			freq[input.charAt(i)-'a']=0;
		}
	}
	
	
public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
    char_freq(input);
 }
}  


            
