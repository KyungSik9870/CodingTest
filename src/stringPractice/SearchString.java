package stringPractice;

import java.util.Scanner;

/**
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 */
public class SearchString {
	public int solution(String str, char t) {
		int answer = 0;

		for (char c : str.toCharArray()) {
			if (Character.toLowerCase(c) == Character.toLowerCase(t)) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		char c = scanner.nextLine().charAt(0);

		SearchString searchString = new SearchString();
		System.out.println(searchString.solution(first, c));
	}
}
