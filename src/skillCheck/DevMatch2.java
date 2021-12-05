package skillCheck;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 음식점에서 배달 어플을 통해 주문을 받고 있습니다. 이때 마지막으로 주문받은 음식이 완성될 시각을 계산하려고 합니다.
 *
 * 음식점에는 n개의 화구가 비치되어 있어서, 최대 n개의 음식까지 동시에 만들 수 있습니다.
 * 음식을 만들 때는 주문받은 순서대로 음식을 만듭니다.
 *
 * 주문받은 시각에 비어있는 화구가 없거나 앞선 주문이 밀려 있다면, 화구가 빌 때까지 기다립니다.
 * 사용할 수 있는 화구가 여러 개라면, 어떤 화구에서나 음식을 조리할 수 있습니다.
 *
 * 한 화구에서 어떤 주문의 조리가 완료됨과 동시에, 다른 주문의 조리를 바로 시작할 수 있습니다.
 * 조리 시간에 따라서 먼저 주문한 음식이 나중에 주문한 음식보다 더 늦게 완성될 수 있습니다.
 *
 * 화구의 개수 n, 조리 시간을 담은 문자열 배열 recipes, 주문 순서를 담은 문자열 배열
 * orders가 매개변수로 주어집니다. 이때, 마지막으로 들어온 주문이 완성될 시각을 return 하도록 solution 함수를 완성해주세요.
 *
 * // String[] recipes = {"A 3", "B 2"};
 * // String[] orders = {"A 1", "A 2", "B 3", "B 4"};
 *
 * 1 2 3 4 5 6 7 8
 * A     A B   B
 *   A     A B   B
 */
public class DevMatch2 {
	public int solution(int n, String[] recipes, String[] orders) {
		int answer = 0;
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<Order> orderList = new ArrayList<>();
		int[] time = new int[n];

		for (String s : recipes) {
			String[] chars = s.split(" ");
			map.put(chars[0], Integer.parseInt(chars[1]));
		}

		for (String s : orders) {
			String[] chars = s.split(" ");
			orderList.add(new Order(chars[0], Integer.parseInt(chars[1])));
		}
		int targetIndex = 0;
		for (int i = 0; i < orderList.size(); i++) {
			Order order = orderList.get(i);
			int target = map.get(order.name) + 1;
			System.out.println("target:"+ target);
			targetIndex = isMin(time);
			time[targetIndex] = time[targetIndex] + target;
		}

		return time[targetIndex];
	}

	public int isMin(int[] array) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				return i;
			}
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}

		return minIndex;
	}

	public static void main(String[] args) {
		DevMatch2 devMatch2 = new DevMatch2();
		int n = 2;
		// String[] recipes = {"A 3", "B 2"};
		// String[] orders = {"A 1", "A 2", "B 3", "B 4"};
		String[] recipes = {"S 3", "F 2", "P 8"};
		String[] orders = {"P 1", "F 2", "S 4", "S 6", "P 7", "S 8"};
		System.out.println(devMatch2.solution(n, recipes, orders));
	}
}

class Order {
	String name;
	int time;

	public Order(String name, int time) {
		this.name = name;
		this.time = time;
	}
}
