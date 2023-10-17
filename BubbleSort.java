import java.util.*;

class BubbleSort
{
    static void swap(int[]X,int ind1,int ind2)
    {
        int temp = X[ind1];
        X[ind1] = X[ind2];
        X[ind2] = temp;
    }
    public static void sort(int []X)
    {
        int n = X.length;
        boolean sorted = false;
        int totalSorted = 0;
        while (totalSorted < (n-1) && !sorted)
        {
            sorted = true;     //will remain true if no swaps are made
            for(int i = 1; i <= n-1-totalSorted; ++i)
            {
                if (X[i-1] > X[i])
                {
                    swap(X, i-1, i);
                    sorted = false;
                }
            }
            totalSorted++;
        }
    }

    static void printArray(int []X)
    {
        for (int i = 0; i < X.length; ++i)
            System.out.print(X[i] + " ");
        System.out.println(" ");
    }
    
    public static void main(String args[]) {
        int myArr1[] = {1, 9, 321, 234, 12, 21, 5, 3, 1, 12, 11, 22, 33, 1, 4, 5, 3, 21, 2};
        sort(myArr1);
        printArray(myArr1);
        /*
        int myArr2[] = {1, 9, 321, 234, 12, 21, 5, 3, 1, 12, 11, 22, 33, 1, 4, 5, 3, 21, 2};
        insertionSort.sort(myArr2);
        printArray(myArr2); */
    }
}