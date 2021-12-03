package sortingPractice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;

/**
 * [중복확인]
 *
 * 현수네 반에는 N명의 학생들이 있습니다.
 * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
 * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
 * N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
 *
 * 8
 * 20 25 52 30 39 33 43 33
 *
 * D
 */
public class CheckDuplicated {
	public String solution(int[] array) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i : array) {
			set.add(i);
		}

		return array.length == set.size() ? "U" : "D";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CheckDuplicated checkDuplicated = new CheckDuplicated();
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(checkDuplicated.solution(array));
	}
}
