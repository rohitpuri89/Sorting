package demo;

public class InsertionSort {
	
	public static int[] InsertionSort(int[] input) {
		if (input == null || input.length == 0) {
			return input;
		}
		int n = input.length;
		for(int i=1; i<n ;i++)
		{
			for(int j=i; j>0; j--)
			{
				if(input[j]<input[j-1])
				{
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
				else
					break;
			}
		}
		return input;
	}

}
