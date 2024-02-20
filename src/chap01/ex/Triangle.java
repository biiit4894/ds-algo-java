package chap01.ex;

import java.util.Scanner;

public class Triangle {
    static void triangleB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {

        for(int i = n; i >= 1; i--) {
            for(int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void triangleRB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;

        System.out.println("삼각형을 출력합니다.");
        do {
            System.out.print("몇 단 삼각형입니까? : ");
            count = scanner.nextInt();
        } while(count <= 0);

        System.out.println("왼쪽 아래 직각 이등변 삼각형");
        triangleB(count);
        System.out.println("왼쪽 위 직각 이등변 삼각형");
        triangleLU(count);
        System.out.println("오른쪽 위 직각 이등변 삼각형");
        triangleRU(count);
        System.out.println("오른쪽 아래 직각 이등변 삼각형");
        triangleRB(count);
    }


}
