package chap01.ex;

import java.util.Scanner;

public class SumGauss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        // Q7
//        int sum = 0;
//
//        for(int i = 1; i <= n; i++) {
//            sum += i;
//            if(i < n) {
//                System.out.print(i + " + ");
//            } else if(i == n) {
//                System.out.println(i + " = " + sum);
//            }
//        }

        // Q8
        // 1 2 3 4 5 6 7 8 9
//        int sum;
//        if(n % 2 == 0) {
//            sum = (n + 1) * n / 2;
//        } else {
//            System.out.println(n / 2);
//            sum = (n + 1) * (n / 2) + (n / 2) + 1;
//        }
        // 정답
        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");


    }
}
