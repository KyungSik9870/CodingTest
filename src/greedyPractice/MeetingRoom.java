package greedyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [회의실 배정]
 *
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고 한다.
 * 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라.
 * 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
 *
 * 5
 * 1 4
 * 2 3
 * 3 5
 * 4 6
 * 5 7
 *
 * 3
 */
public class MeetingRoom {
	public int solution(ArrayList<Meeting> meetings) {
		int answer = 0;
		int min = Integer.MIN_VALUE;
		Collections.sort(meetings);
		for (Meeting m : meetings) {
			if (m.start >= min){
				answer++;
				min = m.end;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    MeetingRoom meetingRoom = new MeetingRoom();
	    int n = scanner.nextInt();
		ArrayList<Meeting> meetings = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			meetings.add(new Meeting(scanner.nextInt(), scanner.nextInt()));
		}
		System.out.println(meetingRoom.solution(meetings));
	}
}

class Meeting implements Comparable<Meeting>{
	int start;
	int end;

	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Meeting o) {
		if (this.end == o.end) {
			return this.start - o.start;
		}
		return this.end - o.end;
	}
}