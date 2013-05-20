package demo;

public class SelectionSort {
	public static int[] SelectionSort(int[] input) {
		if (input == null || input.length == 0) {
			return input;
		}
		int n = input.length;
		for(int i=0; i<n; i++)
		{
			int min = input[i];
			for(int j=i+1; j<n; j++)
			{
				if(input[j]<min)
				{
					min = input[j];
					input[j] = input[i];
					input[i] = min;
				}
			}
		}
		return input;
	}
}
