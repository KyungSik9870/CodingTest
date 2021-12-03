package stringPractice;

import java.util.Scanner;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * ksekkset -> kset
 */
public class RemoveDuplicated {

	public String solution(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String s : str.split("")) {
			if (stringBuilder.indexOf(s) == -1) {
				stringBuilder.append(s);
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		RemoveDuplicated removeDuplicated = new RemoveDuplicated();
		System.out.println(removeDuplicated.solution(str));
	}
}
