package chap01.ex;

import java.util.Scanner;

public class Max4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("네 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : ");
        a = sc.nextInt();
        System.out.print("b의 값 : ");
        b = sc.nextInt();
        System.out.print("c의 값 : ");
        c = sc.nextInt();
        System.out.print("d의 값 : ");
        d = sc.nextInt();

        int max = max4(a, b, c, d);

        System.out.println("최댓값은 " + max + "입니다.");
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;

        return max;
    }
}
