package hashPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * [오픈채팅방 - 카카오]
 *
 * ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
 *
 * ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
 */
public class OpenChat {

	public String[] solution(String[] record) {
		Map<String, String> map = new HashMap<>();
		int length = 0;
		for (String s : record) {
			String[] sub = s.split(" ");
			if (sub[0].equals("Enter")) {
				map.put(sub[1], sub[2]);
				length++;
			} else if (sub[0].equals("Change")) {
				map.put(sub[1], sub[2]);
			} else {
				length++;
			}
		}

		int index = 0;
		String[] answer = new String[length];
		for (String s : record) {
			String[] sub = s.split(" ");
			if (sub[0].equals("Enter")) {
				answer[index] = map.get(sub[1]) + "님이 들어왔습니다.";
				index++;
			} else if (sub[0].equals("Leave")) {
				answer[index] = map.get(sub[1]) + "님이 나갔습니다.";
				index++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		OpenChat openChat = new OpenChat();
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
			"Change uid4567 Ryan"};
		for (String s : openChat.solution(record)) {
			System.out.println(s);
		}
	}
}