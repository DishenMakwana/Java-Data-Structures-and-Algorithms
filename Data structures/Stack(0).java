import java.util.*;

public class MyLinkedlist<E>
{
  Node<E> head;
  static class Node<E>
  {
    E data;
    Node<E> next;
    public Node(E data)
    {
      this.data = data;
      this.next = null;
    }
  }
  public void add(E data)
  {
    Node<E> toadd=new Node<E>(data);
   
    if( isEmpty() )
    {
      head = toadd;
      return;
    }
   
    Node<E> temp=head;
    while(temp.next != null)
    {
      temp=temp.next;
    }
    temp.next=toadd;
  }
 
  public void print()
  {
    Node<E> temp=head;
    while(temp != null)
    {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
 
  public boolean isEmpty()
  {
    return head==null;
  } 
  public E removeLast() throws Exception
  {
    Node<E> temp=head; 
    if(temp == null) 
    {
      throw new Exception ("Stack is Empty");
    }
    if(temp.next == null) 
    {
       Node<E> toRemove = head;
       head = null; 
       return toRemove.data; 
    }
       
    while(temp.next.next != null) 
    {
      temp= temp.next;
    } 
    Node<E> toRemove = temp.next;
    temp.next = null; 
    return toRemove.data;
  } 
  public E getLast() throws Exception 
  {
    Node<E> temp=head; 
    if(temp == null) 
    {
      throw new Exception ("Stack is Empty");
    }
       
    while(temp.next != null) 
    {
      temp= temp.next;
    } 
    
    return temp.data;
  }
}
/*public class solution
{
  public static void main(String args[])
  {
    MyLinkedlist<Integer> ll=new MyLinkedlist();
    for(int i=0;i<100;i++)
       ll.add(i);
    ll.print();
  }
}
*/
  
public class MyStack<E> 
{ 
  private MyLinkedlist<E> ll=new MyLinkedlist<>();
  void push(E e) 
  {
    ll.add(e);
  } 
  E pop() throws Exception
  {
    if(ll.isEmpty()) 
    {
      throw new Exception ("Popping ftom stack is not allowed because stack is empty");
    } 
    return ll.removeLast();
  } 
  E peek() throws Exception
  { 
    if(ll.isEmpty()) 
    {
      throw new Exception ("Peeking from stack is not allowed because stack is empty");
    } 
    return ll.getLast();
  }
} 

public class Solve 
{
  public static void main (String args[]) throws Exception
  {
    MyStack<Integer> stack = new MyStack(); 
    //stack.push(12); 
    //stack.push(24); 
   // stack.push(36); 
    System.out.println(stack.pop()); 
    System.out.println(stack.peek());
  }
}
