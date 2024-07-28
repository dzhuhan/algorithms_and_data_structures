class DoublyLinkedList
{
	int size;
	private Node head;
	private Node tail;
	private class Node
	{
		int data;
		Node next;
		Node prev;
		public Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}

	public DoublyLinkedList()
	{
		size = 0;
		head = null;
		tail = null;	
	}

	public int get(int pos)
	{
		Node temp;
		if(head == null)
		{
			System.out.println("List is empty");
			return -1;
		}
		
		if(pos < size / 2)
		{
			temp = head;
			
			int i = 0;
			while(temp != null)
			{
				if(i == pos)
					return temp.data;

				temp = temp.next;
				i++;
			}
		}
		else
		{
			temp = tail;
		
			int i = size - 1;
			while(temp != null)
			{
				if(i == pos)
					return temp.data;

				temp = temp.prev;
				i--;
			}
		}
		
		System.out.println("Value not found");
		return -1;
	}

	public void insert(int pos, int data)
	{
		Node temp = new Node(data);

		if(pos == 0 && head == null)
		{
			head = tail = temp;
			size++;
			return;
		}
		else if(pos == 0)
		{
			head.prev = temp;
			temp.next = head;
			head = temp;
			size++;
			return;
		}
		else if(pos == size)
		{
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
			size++;
			return;
		}
				
		if(pos < size / 2)
		{
			temp = head.next;
			
			int i = 1;
			while(temp != null)
			{
				if(i == pos)
				{
					Node n = new Node(data);
					n.next = temp;
					temp.prev.next = n;
					n.prev = temp.prev;
					temp.prev = n;
					size++;
					return;
				}

				temp = temp.next;
				i++;
			}
		}
		else
		{
			temp = tail;
			
			int i = size - 1;
			while(temp != null)
			{
				if(i == pos)
				{
					Node n = new Node(data);
					n.next = temp;
					temp.prev.next = n;
					n.prev = temp.prev;
					temp.prev = n;
					size++;
					return;
				}

				temp = temp.prev;
				i--;
			}
		}
	}

	public void append(int data)
	{
		Node temp = new Node(data);
		size++;
		
		if(tail == null)
		{
			head = tail = temp;
			return;
		}

		tail.next = temp;
		temp.prev = tail;
		tail = temp;
	}
	
	public void push(int data)
	{
		Node temp = new Node(data);
		size++;
		
		if(tail == null)
		{
			head = tail = temp;
			return;
		}

		temp.next = head;
		head.prev = temp;
		head = temp;
	}

	public void delete(int pos)
	{
		Node temp;

		if(head == null)
			return;

		if(pos == 0)
		{
			size--;
			head = head.next;
			if(head == null)
			{
				tail = null;
				return;
			}
			head.prev = null;
			return;
		}
		if(pos == size - 1)
		{
			size--;
			tail = tail.prev;
			if(tail == null)
			{
				head = null;
				return;
			}
			tail.next = null;
			return;
		}
		
		if(pos < size / 2)
		{
			temp = head.next;
			
			int i = 1;
			while(temp != null)
			{
				if(i == pos)
				{
					temp.next.prev = temp.prev;
					temp.prev.next = temp.next;
					size--;
					return;
				}

				temp = temp.next;
				i++;
			}
		}
		else if(pos < size)
		{
			temp = tail;
			
			int i = size - 2;
			while(temp != null)
			{
				if(i == pos)
				{
					temp.next.prev = temp.prev;
					temp.prev.next = temp.next;
					size--;
					return;
				}

				temp = temp.next;
				i++;
			}
		}
	}
	
	public boolean is_empty()
	{
		return head == null;
	}
}

public class Main {
	public static void main(String[] args) {
		
		DoublyLinkedList l = new DoublyLinkedList();

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
		l.insert(0, 333);
		l.insert(6, 789);
		l.append(1000);
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		System.out.println(l.get(5));
		System.out.println(l.get(6));
		System.out.println(l.get(7));
		System.out.println();
		System.out.println(l.get(8));
		System.out.println();
		
		System.out.println(l.is_empty());
	}
}