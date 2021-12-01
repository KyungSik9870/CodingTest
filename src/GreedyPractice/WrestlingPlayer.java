package GreedyPractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [씨름선수]
 *
 * 현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다.
 * 현수는 각 지원자의 키와 몸무게 정보를 알고 있습니다.
 * 현수는 씨름 선수 선발 원칙을 다음과 같이 정했습니다.
 * “A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가
 * 존재하면 A지원자는 탈락하고, 그렇지 않으면 선발된다.”
 * N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇 명의 선수를 선발할 수 있는지 알아내는 프로그램을 작성하세요.
 *
 * 5
 * 172 67
 * 183 65
 * 180 70
 * 170 72
 * 181 60
 *
 * 3
 *
 * (183, 65), (180, 70), (170, 72) 가 선발됩니다.
 * (181, 60)은 (183, 65)보다 키와 몸무게 모두 낮기 때문에 탈락이고,
 * (172, 67)은 (180, 70) 때문에 탈락입니다.
 */
public class WrestlingPlayer {
	public int solution(Player[] players) {
		int answer = 0;
		Arrays.sort(players);
		int max = Integer.MIN_VALUE;

		for (Player p : players) {
			if(p.weight > max) {
				max = p.weight;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WrestlingPlayer wrestlingPlayer = new WrestlingPlayer();
		int n = scanner.nextInt();
		Player[] players = new Player[n];
		for (int i = 0; i < n; i++) {
			players[i] = new Player(scanner.nextInt(), scanner.nextInt());
		}
		System.out.println(wrestlingPlayer.solution(players));
	}
}

class Player implements Comparable<Player> {
	int height;
	int weight;

	public Player(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Player o) {
		return o.height - this.height;
	}
}