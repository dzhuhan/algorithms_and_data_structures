class List
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

	public List()
	{
		head = null;
		tail = null;	
	}

	public int get(int pos)
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("List is empty");
			return -1;
		}	
		
		int i = 0;
		while(temp != null)
		{
			if(i == pos)
				return temp.data;

			temp = temp.next;
			i++;
		}
		
		System.out.println("Value not found");
		return -1;
	}

	public void insert(int pos, int data)
	{
		Node temp = head;

		if(pos == 0)
		{
			head = tail = new Node(data);
			return;
		}	
		
		--pos;
		int i = 0;
		while(temp != null)
		{
			if(i == pos)
			{
				Node n = new Node(data);
				n.next = temp.next;

				if(n.next == null)
					tail = n;

				temp.next = n;
				return;
			}

			temp = temp.next;
			i++;
		}
	}

	public void append(int data)
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
	
	public void push(int data)
	{
		Node temp = new Node(data);
		
		if(tail == null)
		{
			head = tail = temp;
			return;
		}

		temp.next = head;
		head = temp;
	}

	public void delete(int pos)
	{
		Node temp = head;

		if(head == null)
		{
			tail = null;
			return;
		}

		if(pos == 0)
		{
			head = head.next;
			return;
		}
		
		--pos;
		int i = 0;
		while(temp != null)
		{
			if(i == pos && temp.next != null)
			{
				if(tail == temp.next)
					tail = temp;
				
				temp.next = temp.next.next;
				return;
			}

			temp = temp.next;
			i++;
		}
	}
	
	public boolean is_empty()
	{
		return head == null;
	}
}

public class Main {
	public static void main(String[] args) {
		
		List l = new List();

		l.append(988);
		l.append(1234);
		l.append(1);

		System.out.println(l.get(2));
		System.out.println();
		l.delete(2);
		l.delete(1);
		l.delete(0);
		l.delete(0);

		l.append(988);
		l.append(1234);
		l.push(4567);
		l.insert(2, 222);
		l.append(111);
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		System.out.println();
		
		System.out.println(l.is_empty());
	}
}