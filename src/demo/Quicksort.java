package demo;

public class Quicksort {
	private static int[] numbers;

	public static int[] QuickSort(int[] input) {
		if (input == null || input.length == 0) {
			return input;
		}
		numbers = input;
		int size = input.length;
		quicksort(0, size - 1);

		return numbers;
	}

	private static void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];
		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}
}