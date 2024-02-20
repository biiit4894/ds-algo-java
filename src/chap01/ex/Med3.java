package chap01.ex;

import java.util.Scanner;

public class Med3 {
    static int med3(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값 : ");
        a = sc.nextInt();
        System.out.print("b의 값 : ");
        b = sc.nextInt();
        System.out.print("c의 값 : ");
        c = sc.nextInt();

        System.out.println("med3(" + a + "," + b + "," + c + ") = " + med3(a, b, c));
    }
}
