package arrayPractice;

import java.util.Scanner;

/**
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 */
public class Student {
	public int solution(int[] inputs) {
		int answer = 0;
		int max = 0;
		for (int i = 0; i < inputs.length; i++) {
			if (inputs[i] > max) {
				max = inputs[i];
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int n = scanner.nextInt();
		int[] inputs = new int[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = scanner.nextInt();
		}
		System.out.println(student.solution(inputs));
	}
}
