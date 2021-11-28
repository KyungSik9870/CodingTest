package SortingPractice;

import java.util.Scanner;

/**
 * [삽입정렬]
 */
public class InsertionSort {
	public int[] solution(int n, int[] array) {
		for (int i = 1; i < n; i++) {
			int temp = array[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (array[j] > temp) {
					array[j + 1] = array[j];
				} else {
					break;
				}
			}
			array[j + 1] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InsertionSort insertionSort = new InsertionSort();
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		for (int a : insertionSort.solution(n, array)) {
			System.out.print(a + " ");
		}
	}
}
