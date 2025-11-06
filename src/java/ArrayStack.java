package java;
public class ArrayStack <T> {
	T st[];
	int size ;
	int capacity;
	//constructor:
	public ArrayStack(int c) {
		capacity=c; size=0;
		st = (T[ ]) new Object[capacity];}
	
	//------------
	public int size() {return size;} //end size
	
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else 
			return false;} // end isEmpty	
	
	public void push (T var_name) {
		if (size < capacity) {
		st[size]=var_name;
		size ++;}
		else
			System.out.println("Stack is full");	}//end push 
	
	public void printStack() {
		for (int i = 0 ; i<size ; i++)
			System.out.print(st[i]+ "  ");}// end printStack
	
	public T pop() {
		if (size > 0) {
		size--;
		return st[size];}
		else
			return null;		}// end pop
	
	public T peek() {
		if (size>0) {
		return st[size-1];}
		else
			System.out.print("Stack is empty");
			return null;	}//end peek	
	
	public boolean find (T item) {
		for (int i=0; i< size; i++)
		{
			if (item == st[i])
				return true;}
		return false; // out of for because if it deosn't found
	}//end find
	
	public void pushNOdup (T k) {
		if (size < capacity) {
		if (find(k))
			System.out.println("duplicate");
		else
			{st[size]=k;
			size++;}
		}//end if
	}//end pushNOdup
	
	
	
}
