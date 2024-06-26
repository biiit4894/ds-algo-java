package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]: "); // 배열의 첫 요소를 먼저 입력받음
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색할 값:");
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky);

		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}
}