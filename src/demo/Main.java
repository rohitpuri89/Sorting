package demo;

import java.io.IOException;

public class Main {
	
	private static int a[] = {5, 3, 6, 1, 0, 5, 2, 9, -5, 12, 23, 2, 4, 9,-29,  6};
	static int result[];
	
	public static void main(String s[])throws IOException
	{
		System.out.println("Main class");
		//result = BubbleSort.BubbleSort(a);
		//result = Quicksort.QuickSort(a);
		//result = Mergesort.sort(a);
		//result = SelectionSort.SelectionSort(a);
		result = InsertionSort.InsertionSort(a);
		if (result == null || result.length==0){
		      return;
		    }
		int n = result.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(result[i]+" ");
		}
	}

}
