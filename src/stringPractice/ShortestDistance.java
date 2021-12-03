package stringPractice;

import java.util.Scanner;

/**
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * teachermode e
 * 1 0 1 2 1 0 1 2 2 1 0
 */
public class ShortestDistance {
	public String solution(String str, char target) {
		int MIN = 0;
		int MAX = 100;

		int[] arrayLt = new int[str.length()];
		int[] arrayRt = new int[str.length()];
		int[] answer = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				MIN = 0;
				arrayLt[i] = 0;
				MIN++;
			} else if (MIN > 0) {
				arrayLt[i] = MIN;
				MIN++;
			} else {
				arrayLt[i] = MAX;
				MAX++;
			}
		}

		MIN = 0;
		MAX = 100;

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == target) {
				MIN = 0;
				arrayRt[i] = 0;
				MIN++;
			} else if (MIN > 0) {
				arrayRt[i] = MIN;
				MIN++;
			} else {
				arrayRt[i] = MAX;
				MAX++;
			}

			answer[i] = Math.min(arrayLt[i], arrayRt[i]);
		}

		StringBuilder b = new StringBuilder();
		for (int i = 0; i < answer.length; i++) {
			b.append(answer[i]);
			if (i < answer.length - 1) {
				b.append(" ");
			}
		}
		return b.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShortestDistance shortestDistance = new ShortestDistance();
		String str = scanner.next();
		char target = scanner.next().charAt(0);
		System.out.println(shortestDistance.solution(str, target));
	}
}
