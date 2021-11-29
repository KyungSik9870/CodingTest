package stackqueuePractice;

import java.util.Scanner;
import java.util.Stack;

/**
 * [괄호문자제거]
 *
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 * EFLM
 */
public class RemoveBracket {

	public String solution(String s) {
		String answer = "";

		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == ')') {
				while (stack.pop() != '(')
					;
			} else {
				stack.push(c);
			}
		}

		for (char c : stack) {
			answer += c + "";
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RemoveBracket removeBracket = new RemoveBracket();
		String s = scanner.nextLine();
		System.out.println(removeBracket.solution(s));
	}
}
