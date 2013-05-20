package demo;

public class Mergesort {
	private static int[] numbers;
	private static int[] buffer;

	public static int[] sort(int[] input) {
		if (input == null || input.length == 0) {
			return input;
		}
		numbers = input;
		int size = input.length;
		buffer = new int[size];
		mergesort(0, size - 1);
		return numbers;
	}

	private static void mergesort(int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergesort(low, middle);
			mergesort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	private static void merge(int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			buffer[i] = numbers[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (buffer[i] <= buffer[j]) {
				numbers[k] = buffer[i];
				i++;
			} else {
				numbers[k] = buffer[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			numbers[k] = buffer[i];
			k++;
			i++;
		}
	}

}