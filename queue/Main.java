class Queue
{
	private Node head;
	private Node tail;
	private class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public void enqueue(int data)
	{
		if(tail == null)
		{
			head = tail = new Node(data);
			return;
		}
		
		tail.next = new Node(data);
		tail = tail.next;
	}
	
	public int dequeue()
	{
		int data;
		if(head == null)
		{
			System.out.println("Queue is empty.");
			return -1;
		}
		
		data = head.data;
		head = head.next;
		
		if(head == null)
			tail = null;
		
		return data;
	}
	
	public int peek()
	{
		int data;
		if(head == null)
		{
			System.out.println("Queue is empty.");
			return -1;
		}
		
		data = head.data;		
		return data;
	}
	
	public boolean is_empty()
	{
		return head == null;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Queue q = new Queue();

		q.enqueue(988);
		q.enqueue(1234);
		q.enqueue(1);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println();

		q.enqueue(222);
		
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.is_empty());
	}
}