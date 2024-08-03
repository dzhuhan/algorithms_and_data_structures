import java.util.Arrays;

class SelectionSort {
    static void sort(int a[])
    {
        int temp;
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String args[]) {
        int a[] = {2345, 2, 345, 23, 123, 33, 11, 1};
        SelectionSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}