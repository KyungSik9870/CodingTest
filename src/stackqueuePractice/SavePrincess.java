package stackqueuePractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * [공주 구하기]
 *
 *
 */
public class SavePrincess {

	public int solution(int n, int m) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		int count = 1;
		while (queue.size() > 1) {
			if (count == m) {
				queue.poll();
				count = 1;
			} else {
				int num = queue.poll();
				queue.add(num);
				count++;
			}
		}
		answer = queue.peek();
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SavePrincess savePrincess = new SavePrincess();
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		System.out.println(savePrincess.solution(n, m));
	}
}
