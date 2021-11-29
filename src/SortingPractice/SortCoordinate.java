package SortingPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [좌표정렬]
 *
 * 5
 * 2 7
 * 1 3
 * 1 2
 * 2 5
 * 3 6
 *
 * 1 2
 * 1 3
 * 2 5
 * 2 7
 * 3 6
 */
public class SortCoordinate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Coordinate> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Coordinate(scanner.nextInt(), scanner.nextInt()));
		}
		Collections.sort(list);
		for (Coordinate c : list) {
			System.out.println(c.left+ " "+c.right);
		}
	}
}

class Coordinate implements Comparable<Coordinate>{
	int left;
	int right;

	public Coordinate(int left, int right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int compareTo(Coordinate o) {
		if (this.left == o.left) return this.right - o.right;
		else return this.left - o.left;
	}
}
