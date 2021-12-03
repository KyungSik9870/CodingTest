package skillCheck;

/**
 * [숫자와 영단어]
 *
 * 1478 → "one4seveneight"
 * 234567 → "23four5six7"
 * 10203 → "1zerotwozero3"
 *
 * 숫자	영단어
 * 0	zero
 * 1	one
 * 2	two
 * 3	three
 * 4	four
 * 5	five
 * 6	six
 * 7	seven
 * 8	eight
 * 9	nine
 */
public class NumAndString {
	public int solution(String s) {
		String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for (int i = 0; i < array.length; i++) {
			s = s.replaceAll(array[i], String.valueOf(i));
		}
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		NumAndString numAndString = new NumAndString();
		System.out.println(numAndString.solution("one4seveneight"));
	}
}
