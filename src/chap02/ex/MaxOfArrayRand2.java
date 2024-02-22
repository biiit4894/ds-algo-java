package chap02.ex;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand2 {
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");

        int num = 1 + rand.nextInt(20); // 1~20 사이 난수로 사람 수 생성
        int[] height = new int[num]; // 요소개 num개인 배열 생성

        System.out.println("사람 수는 " + num + "명입니다.");

        System.out.println("키는 다음과 같습니다.");
        for(int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90); // 요소의 값을 난수로 생성
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + " 입니다.");
    }
}
