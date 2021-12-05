package skillCheck;

public class DevMatch1 {

	public int solution(String[] drum) {
		int answer = 0;

		char[][] arr = new char[drum.length][drum.length];
		for (int i = 0; i < drum.length; i++) {
			char[] chars = drum[i].toCharArray();
			for (int j = 0; j < chars.length; j++) {
				arr[i][j] = chars[j];
			}
		}

		for (int i = 0; i < drum.length; i++) {
			int ip = 0, jp = i;
			int starCount = 0;

			while (ip < drum.length) {
				if (arr[ip][jp] == '#') {
					ip++;
				} else if (arr[ip][jp] == '*') {
					starCount++;
					ip++;
				} else if (arr[ip][jp] == '>') {
					jp++;
				} else if (arr[ip][jp] == '<') {
					jp--;
				}
				if (starCount == 2)
					break;

				if (ip == drum.length){
					answer++;
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
		String[] drum = {"###", "###", "###"};
		DevMatch1 devMatch1 = new DevMatch1();
		System.out.println(devMatch1.solution(drum));
	}
}
