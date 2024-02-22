package chap02.ex;

import java.util.Scanner;

public class SumOf {
    static int sumOf(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수는 : ");
        int count = stdIn.nextInt();

        int[] arr = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.print("a[" + i + "] : ");
            arr[i] = stdIn.nextInt();
        }


        System.out.println("배열 요소의 합계 : " + sumOf(arr));

    }
}
