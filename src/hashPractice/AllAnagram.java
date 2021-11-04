package hashPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * [모든 아나그램 찾기]
 *
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 *
 * bacaAacba
 * abc
 *
 * 3
 * {bac, acb, cba}
 */
public class AllAnagram {

	public int solution(String s, String t) {
		int answer = 0;

		List<String> list = new ArrayList<>();
		for (int i = 0; i < s.length() - t.length() + 1; i++) {
			list.add(s.substring(i, i + t.length()));
		}

		for (String str : list) {
			HashMap<Character, Integer> map = new HashMap<>();
			boolean flag = true;

			for (char c : t.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}

			for (char c : str.toCharArray()) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) - 1);
				}
			}

			for (char c : map.keySet()) {
				if (map.get(c) != 0) {
					flag = false;
				}
			}

			if (flag) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AllAnagram anagram = new AllAnagram();
		String s = scanner.nextLine();
		String t = scanner.nextLine();
		System.out.println(anagram.solution(s, t));
	}
}
