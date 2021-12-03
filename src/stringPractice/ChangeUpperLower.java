package stringPractice;

import java.util.Scanner;

/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 */
public class ChangeUpperLower {
	public String solution(String str) {
		String answer = "";
		for (char s : str.toCharArray()) {
			if (Character.isUpperCase(s)) {
				answer += Character.toLowerCase(s);
			} else {
				answer += Character.toUpperCase(s);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		ChangeUpperLower changeUpperLower = new ChangeUpperLower();
		System.out.println(changeUpperLower.solution(str));
	}
}
