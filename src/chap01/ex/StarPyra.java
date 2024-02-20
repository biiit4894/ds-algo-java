package chap01.ex;

import java.util.Scanner;

public class StarPyra {
    static void spira(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("피라미드를 출력합니다.");
        do {
            System.out.print("단 수 : ");
            n = sc.nextInt();
        } while(n <= 0);
        spira(n);
    }
}
