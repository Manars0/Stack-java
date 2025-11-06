package lec5;

import java.ArrayStack;
import java.util.Scanner;
import java.util.Stack;
public class testST {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
	    int x;
	   
	    System.out.println("enter the stack size: ");
	    x=s.nextInt();
	    
	    ArrayStack <Integer> o = new ArrayStack<>(x);
	    
	    for (int i =1; i<=x; i++)
	    	o.push(i);
	    	
	    o.printStack();

	}

}
