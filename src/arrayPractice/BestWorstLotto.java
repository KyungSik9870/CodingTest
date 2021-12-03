package arrayPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

/**
 * [로또의 최고 순위와 최저 순위]
 */
public class BestWorstLotto {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int count = 0;
		int zero_count = 0;

		List<Integer> wins = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

		for (int x : lottos) {
			if (x == 0) {
				zero_count++;
			} else if (wins.contains(x)) {
				count++;
			}
		}

		answer[0] = rank(count + zero_count);
		answer[1] = rank(count);
		return answer;
	}

	public int rank(int match) {
		switch (match) {
			case 6:
				return 1;
			case 5:
				return 2;
			case 4:
				return 3;
			case 3:
				return 4;
			case 2:
				return 5;
			default:
				return 6;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BestWorstLotto bestWorstLotto = new BestWorstLotto();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		for (int a : bestWorstLotto.solution(lottos, win_nums)) {
			System.out.println(a);
		}
	}
}
