package sortingPractice;

import java.util.Scanner;

/**
 * [선택정렬]
 */
public class SelectionSort {
	public int[] solution(int n, int[] array) {
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			for (int j = i; j < n; j++) {
				if (array[j] < array[idx]) {
					idx = j;
				}
			}
			int temp = array[i];
			array[i] = array[idx];
			array[idx] = temp;
		}

		return array;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SelectionSort selectionSort = new SelectionSort();
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		for (int a : selectionSort.solution(n, array)) {
			System.out.print(a + " ");
		}
	}
}
