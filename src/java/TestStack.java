package java;

public class TestStack {
	public static void main (String[] args) {
	ArrayStack <Integer> object1 = new ArrayStack<>(4);
	
	System.out.println(object1.isEmpty());
	System.out.println(object1.size());
	object1.push(2);
	object1.push(3);
	object1.push(4);
	object1.push(4);
	
	
	object1.printStack();

}

}

