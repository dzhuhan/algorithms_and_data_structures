class Queue
{
	private Node head;
	private Node tail;
	private class Node 
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}

	public Queue()
	{
		head = null;
		tail = null;	
	}

	public void insert(int data)
	{
		Node temp = new Node(data);
		
		if(tail == null)
		{
			head = tail = temp;
			return;
		}

		tail.next = temp;
		tail = temp;
	}

	public int delete()
	{
		int temp;

		if(head == null)
		{
			System.out.println("Queue is empty");
			return -1;
		}

		temp = head.data;		
		head = head.next;

		if(head == null)
			tail = null;

		return temp;
	}
	
	public int peek()
	{
		if(head != null)
			return head.data;
			
		System.out.println("Queue is empty");
		return -1;
	}
	
	public boolean is_empty()
	{
		return head == null;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Queue q = new Queue();

		q.insert(988);
		q.insert(1234);
		q.insert(1);

		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println();

		q.insert(222);
		
		System.out.println(q.peek());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.is_empty());
	}
}