package java;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// ArrayStack <Integer> object1 = new ArrayStack<>(7);
		
		//System.out.println(object1.isEmpty());
		//System.out.println(object1.size());
		//object1.push(2);
		//object1.push(3);
		//object1.push(4);
	//	object1.push(1);
		
		//object1.pushNOdup(4);
		//object1.pushNOdup(5);
		
		//object1.printStack();
		
		
		Scanner s = new Scanner(System.in);
		
		ArrayStack <String> st = new ArrayStack<>(10);
		
		for (int i =0; i<5; i++) {
		System.out.println("Enter a name:");
		String x= s.next();
		
		st.push(x);
		}
		
		st.printStack();
		
		System.out.println(st.peek());
		System.out.println(st.size());
		
		
		
		
		
		
		
		

	}

}
