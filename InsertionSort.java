import java.util.*;

class InsertionSort
{
    static void swap(int[]X,int ind1,int ind2)
    {
        int temp = X[ind1];
        X[ind1] = X[ind2];
        X[ind2] = temp;
    }
    
    public static void sort(int []X)
    {
        int totalSorted = 1;
        int n = X.length;
        while (totalSorted <= (n-1))
        {
            //insert the item at index position totalSorted into top half
            //by successive comparison with items before it
            int i = totalSorted;
            while(i > 0 && X[i-1] > X[i])
            {
                swap(X, i-1, i);
                i--;
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
        int myArr2[] = {1, 9, 321, 234, 12, 21, 5, 3, 1, 12, 11, 22, 33, 1, 4, 5, 3, 21, 2};
        sort(myArr2);
        printArray(myArr2); 
    }
}