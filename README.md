## Stack Implementation (Java)
A simple generic stack implementation in Java using an array-based approach.
> This project demonstrates how to create and manage a LIFO (Last In, First Out) data structure using arrays and generics.
> This project highlights core concepts of Data Structures and Object-Oriented Programming (OOP).

## Features
- Generic implementation (<T>) that supports any data type
- Stack operations:
  - push() → Add an element
  - pop() → Remove the top element
  - peek() → View the top element
  - isEmpty() and size() → Check stack status
  - find() method to search for an element
  - pushNOdup() method to prevent duplicate insertions
  - printStack() to display all stack elements
- Handles overflow and underflow cases gracefully

## Technologies Used
- Java (JDK 17 or later)
- OOP Concepts (Encapsulation, Generics)
- Data Structures (Stack – Array Implementation)

## Class Overview
ArrayStack<T>
Represents a stack data structure using a fixed-size array.
`````
public class ArrayStack<T> {
    T st[];
    int size;
    int capacity;

    public ArrayStack(int c) {
        capacity = c;
        size = 0;
        st = (T[]) new Object[capacity];
    }

    public void push(T var_name) { ... }
    public T pop() { ... }
    public T peek() { ... }
    public boolean isEmpty() { ... }
    public boolean find(T item) { ... }
    public void pushNOdup(T item) { ... }
    public void printStack() { ... }
}
`````
**Example Usage**
`````
ArrayStack<Integer> stack = new ArrayStack<>(5);
stack.push(10);
stack.push(20);
stack.push(30);

stack.printStack();  // Output: 10  20  30

System.out.println("Top element: " + stack.peek());
System.out.println("Removed: " + stack.pop());
stack.printStack();  // Output: 10  20
`````
**Example Console Output**
`````
true
0
2  3  4  4
Enter a name:
Sara
Enter a name:
Mona
Enter a name:
Lana
Enter a name:
Haya
Enter a name:
Manar
Sara  Mona  Lana  Haya  Manar
Manar
5
`````
## Test Files
`TestStack.java`
Tests the basic stack operations: push, pop, print, and status checks.

`test.java`
Interactive version that allows user input through the console to push names and view stack details.

## Author
**Manar Salem**  
Programming and Database Student  
[https://github.com/Manars](https://github.com/Manars)
