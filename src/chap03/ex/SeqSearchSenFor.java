package chap03.ex;

import java.util.Scanner;

public class SeqSearchSenFor {

	static int binSearch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();

		for(int i = 1; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();

		}

		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();

		int idx = binSearch(x, num, ky);

		if(idx == -1) {
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}

	}
}
