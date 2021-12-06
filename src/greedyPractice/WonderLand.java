package greedyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [원더랜드]
 *
 * 크루스칼 알고리즘, Union & Find
 */
public class WonderLand {
	static int[] unf;

	public static int Find(int v) {
		if (v == unf[v])
			return v;
		else
			return unf[v] = Find(unf[v]);
	}

	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if (fa != fb)
			unf[fa] = fb;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		unf = new int[n + 1];
		ArrayList<Edge> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			unf[i] = i;
		}
		for (int i = 1; i <= m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			list.add(new Edge(a, b, c));
		}

		int answer = 0;
		int cnt = 0;
		Collections.sort(list);
		for (Edge edge : list) {
			if (cnt == n - 1) {
				break;
			}
			int fl = Find(edge.left);
			int fr = Find(edge.right);
			if (fl != fr) {
				cnt++;
				answer += edge.cost;
				Union(edge.left, edge.right);
			}
		}

		System.out.println(answer);
	}
}

class Edge implements Comparable<Edge> {
	int left;
	int right;
	int cost;

	public Edge(int left, int right, int cost) {
		this.left = left;
		this.right = right;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}