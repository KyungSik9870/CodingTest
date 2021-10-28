package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 */
public class CommonInstance {
	public List<Integer> solution(int[] a, int[] b) {
		List<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);

		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				answer.add(a[i++]);
				j++;
			} else if (a[i] < b[j]) {
				i++;
			} else {
				j++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CommonInstance commonInstance = new CommonInstance();

		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = scanner.nextInt();
		}

		for (int i : commonInstance.solution(a, b)) {
			System.out.print(i + " ");
		}
	}
}
