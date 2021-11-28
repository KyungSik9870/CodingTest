package stackqueuePractice;

import java.util.Scanner;
import java.util.Stack;

/**
 * [후위식 연산]
 *
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 *
 * 352+*9-
 * 12
 */
public class Postfix {

	public int solution(String s) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(c - 48);
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (c == '+') {
					stack.push(lt + rt);
				} else if (c == '-') {
					stack.push(lt - rt);
				} else if (c == '*') {
					stack.push(lt * rt);
				} else if (c == '/') {
					stack.push(lt / rt);
				}
			}
		}
		answer = stack.get(0);
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Postfix postfix = new Postfix();
		String s = scanner.nextLine();
		System.out.println(postfix.solution(s));
	}
}
