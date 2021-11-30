package SortingPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StallAlgorithm {
	public int solution(int n, int m, int[] array) {
		int answer = 0;
		Arrays.sort(array);

		int lt = 1;
		int rt = array[n - 1];

		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(array, mid) >= m) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}
		return answer;
	}

	public int count(int[] array, int mid) {
		int ep = array[0];
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] - ep >= mid) {
				ep = array[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StallAlgorithm stallAlgorithm = new StallAlgorithm();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println(stallAlgorithm.solution(n, m, array));
	}
}
