package chap01.ex;

import java.util.Scanner;

public class NumPira {
    static void npira(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.printf("%d", i % 10);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");
        do{
            System.out.print("단 수를 입력하세요: ");
            n = scanner.nextInt();
        }while(n <= 0);

        npira(n);
    }
}
