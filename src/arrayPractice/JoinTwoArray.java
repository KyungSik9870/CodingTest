package arrayPractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 */
public class JoinTwoArray {
	public List<Integer> solution(int[] a, int[] b) {
		List<Integer> listN = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> listM = Arrays.stream(b).boxed().collect(Collectors.toList());
		listN.addAll(listM);

		Collections.sort(listN);
		return listN;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JoinTwoArray joinTwoArray = new JoinTwoArray();

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
		for (int i : joinTwoArray.solution(a, b)) {
			System.out.print(i + " ");
		}
	}
}
