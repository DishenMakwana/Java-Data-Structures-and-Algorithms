import java.util.*;

import linkedLists.MyLinkedList; //import my implemented linkedlist here

public class MyStack<E> {

  private MyLinkedList<E> ll = new MyLinkedList<>();

  void push(E e) {
    ll.add(e);//adding the element in the last node of the linked list
  }

  E pop() throws Exception {
//handling the empty linked list while trying to pop
    if(ll.isEmpty()) {
      throw new Exception("Popping from empty stack is not allowed");

    }
    return ll.removeLast();
  }

  E peek() throws Exception {
//handling the empty linked list while trying to peek
    if(ll.isEmpty()) {
      throw new Exception("Peeking from empty stack is not allowed");

    }
    return ll.getLast();
  }

}


public class MainClass {

	public static void main(String[] args) throws Exception {

		MyStack<Integer> stack = new MyStack<>();

    // delete the top element of the stack.
		int popped = stack.pop();

    //print the last popped element of the stack.
		System.out.println(popped);

    //print the top element of the stack.
		int peeked = stack.peek();

		System.out.println(peeked);

	}

}
