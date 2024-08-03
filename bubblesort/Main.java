import java.util.Arrays;

class Bubblesort {
    static void sort(int a[])
    {
        int temp;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String args[]) {
        int a[] = {4057, 11, 23000, 1, 111, 10, 234, 44, 200};
        Bubblesort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}