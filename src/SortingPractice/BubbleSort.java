package SortingPractice;

import java.util.Scanner;

/**
 * [버블정렬]
 */
public class BubbleSort {
	public int[] solution(int n, int[] array) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BubbleSort bubbleSort = new BubbleSort();
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		for (int a : bubbleSort.solution(n, array)) {
			System.out.print(a + " ");
		}
	}
}
