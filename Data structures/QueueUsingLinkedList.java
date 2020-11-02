import java.util.*;

import linkedLists.MyLinkedList.Node; //import my implemented linkedlist class

public class MyQueue<E> {

  private Node<E> head, rear;

  public void enqueue(E e) {

    Node<E> toAdd = new Node<>(e);
    if (head == null) {
      head = rear = toAdd;
      return;
    }

    rear.next = toAdd;
    rear = rear.next;

  }

  public E dequeue() {

    if (head == null) {
      return null;
    }

    Node<E> temp = head;
    head = head.next;

    if (head == null) {
      rear = null;
    }

    return temp.data;
  }

}

public class MainClass {

  public static void main(String[] args) {

    MyQueue<Integer> mq = new MyQueue<>();
    
    // method to add element in queue  
    mq.enqueue(12);
    mq.enqueue(2);
    mq.enqueue(123);
    mq.enqueue(45);
    
    //printing the element removed from the beginning of queue 
    System.out.println(mq.dequeue());
    System.out.println(mq.dequeue());
    System.out.println(mq.dequeue());
    System.out.println(mq.dequeue());
    System.out.println(mq.dequeue());

    mq.enqueue(451);
    System.out.println(mq.dequeue());

  }

}
