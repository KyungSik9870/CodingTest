package GreedyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wedding {
	public int solution(ArrayList<Time> list) {
		int answer = 0;
		int count = 0;
		Collections.sort(list);
		for (Time t : list) {
			if (t.state == 's'){
				count++;
			} else {
				count--;
			}
			answer = Math.max(answer, count);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Wedding wedding = new Wedding();
		int n = scanner.nextInt();
		ArrayList<Time> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			list.add(new Time(start, 's'));
			list.add(new Time(end, 'e'));
		}
		System.out.println(wedding.solution(list));
	}
}

class Time implements Comparable<Time> {
	int time;
	char state;

	public Time(int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Time o) {
		if (this.time == o.time) {
			return this.state - o.state;
		}
		return this.time - o.time;
	}
}
