package occ.learning;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}

	public int multiply(int a, int b) {
		return a*b;
	}

	public Set<Integer> digitNumber(int number) {
		Set<Integer> integers=new HashSet<Integer>();
		String numString=String.valueOf(number);
		for(int i=0;i<numString.length();i++) {
			if(numString.charAt(i)!='-') {
				integers.add(Integer.parseInt(numString, i, i+1, 10));
			}
		}
		return integers;
	}
	

}
