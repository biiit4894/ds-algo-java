package chap01.ex;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사각형을 출력합니다.");

        int count;
        do {
            System.out.print("단 수 : ");
            count = scanner.nextInt();
        } while (count <= 0);

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}