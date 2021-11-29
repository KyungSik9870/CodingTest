package stackqueuePractice;

import java.util.Scanner;
import java.util.Stack;

public class CorrectBracket {

	public String solution(String s) {
		String answer = "";
		answer = isCorrect2(s) ? "YES" : "NO";
		return answer;
	}

	public boolean isCorrect(String p) {
		int index = 0;
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				index++;
			} else {
				index--;
			}
			if (index < 0)
				return false;
		}
		return index == 0;
	}

	public boolean isCorrect2(String s) {
		boolean answer = true;
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CorrectBracket correctBracket = new CorrectBracket();
		String s = scanner.nextLine();
		System.out.println(correctBracket.solution(s));
	}
}
