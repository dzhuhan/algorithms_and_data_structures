class JumpSearch
{
	public static int search(int[] a, int val)
	{
		int jump = (int)(Math.sqrt(a.length));
		int idx = jump;
		
		while(idx < a.length)
		{
			if(val < a[idx])
			{
				for(int i = idx - 1; i >= idx - jump; i--)
					if(val == a[i])
						return i;

				System.out.println("Value not found");
				return -1;
			}
			idx += jump;
		}
		
		if(val <= a[a.length - 1])
		{
			for(int i = a.length - 1; i >= a.length - 1 - jump; i--)
				if(val == a[i])
					return i;
		}

		System.out.println("Value not found");
		return -1;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		int a[] = {1, 3, 5, 88, 90, 222, 333, 488, 577, 2837, 6000, 23000, 23920, 40000, 60000};
		System.out.println("val: " + a[JumpSearch.search(a, 577)] + " pos: " + JumpSearch.search(a, 577));
		System.out.println("val: " + a[JumpSearch.search(a, 60000)] + " pos: " + JumpSearch.search(a, 60000));
		System.out.println("val: " + a[JumpSearch.search(a, 40000)] + " pos: " + JumpSearch.search(a, 40000));
		System.out.println("val: " + a[JumpSearch.search(a, 3)] + " pos: " + JumpSearch.search(a, 3));
		System.out.println("val: " + a[JumpSearch.search(a, 1)] + " pos: " + JumpSearch.search(a, 1));
		System.out.println("pos: " + JumpSearch.search(a, -133));
		System.out.println("pos: " + JumpSearch.search(a, 128000));
	}
}