class BinarySearch
{
	public static int search(int[] a, int val)
	{
		int low = 0;
		int high = a.length - 1;
		int mid = high / 2;
		while(mid > 0 && mid < a.length - 1)
		{
			if(val > a[mid])
			{
				low = mid + 1;
				mid = low + (high - low) / 2;
			}
			else if(val < a[mid])
			{
				high = mid - 1;
				mid = low + (high - low) / 2;
			}
			else
				return mid;
		}
		
		if(val == a[mid])
			return mid;

		System.out.println("Value not found");
		return -1;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		int a[] = {2, 3, 4, 67, 78, 111, 124, 453, 488, 1234, 2333, 3444, 3555, 3777, 3888, 4555, 4777, 4888, 5888};
		System.out.println("val: " + a[BinarySearch.search(a, 1234)] + " pos: " + BinarySearch.search(a, 1234));
		System.out.println("val: " + a[BinarySearch.search(a, 5888)] + " pos: " + BinarySearch.search(a, 5888));
		System.out.println("val: " + a[BinarySearch.search(a, 3888)] + " pos: " + BinarySearch.search(a, 3888));
		System.out.println("val: " + a[BinarySearch.search(a, 4)] + " pos: " + BinarySearch.search(a, 4));
		System.out.println("val: " + a[BinarySearch.search(a, 2)] + " pos: " + BinarySearch.search(a, 2));
		System.out.println("pos: " + BinarySearch.search(a, -293));
		System.out.println("pos: " + BinarySearch.search(a, 23000));
	}
}