package stringPractice;

import java.util.Scanner;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 */
public class Palindrome {

	public String solution(String str) {
		String s = str.toLowerCase().replaceAll("[^a-z]", "");

		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			if (chars[i] != chars[chars.length - 1 - i]) {
				return "NO";
			}
		}

		return "YES";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Palindrome palindrome = new Palindrome();
		String str = scanner.nextLine();
		System.out.println(palindrome.solution(str));
	}
}
