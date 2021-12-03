package greedyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * [최대 수입 스케쥴(Priority Queue)]
 *
 * 현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해왔다. 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
 * 각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케쥴을 짜야 한다.
 * 단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.
 *
 * 6
 * 50 2
 * 20 1
 * 40 2
 * 60 3
 * 30 3
 * 30 1
 *
 * 150
 */
public class MaxIncome {

	public int solution(ArrayList<Lecture> list) {
		int answer = 0;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue(Collections.reverseOrder());
		Collections.sort(list);
		int max = list.stream().findFirst().get().day;
		int j = 0;
		for (int i = max; i >= 1; i--) {
			for (; j < list.size(); j++) {
				if (list.get(j).day < i)
					break;
				priorityQueue.add(list.get(j).money);
			}
			if (!priorityQueue.isEmpty()) {
				answer += priorityQueue.poll();
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MaxIncome maxIncome = new MaxIncome();
		int n = scanner.nextInt();
		ArrayList<Lecture> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Lecture(scanner.nextInt(), scanner.nextInt()));
		}
		System.out.println(maxIncome.solution(list));
	}
}

class Lecture implements Comparable<Lecture> {
	int money;
	int day;

	public Lecture(int money, int day) {
		this.money = money;
		this.day = day;
	}

	@Override
	public int compareTo(Lecture o) {
		return o.day - this.day;
	}
}