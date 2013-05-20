package demo;

public class BubbleSort {

	public static int[] BubbleSort(int input[]) {
		if (input ==null || input.length==0){
		      return input;
		    }
		int n = input.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}
}
