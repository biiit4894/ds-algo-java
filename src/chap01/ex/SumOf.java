package chap01.ex;
import java.util.Scanner;

public class SumOf {
    static int sumOf(int a, int b) {
        int min;
        int max;

        if(a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        int sum = 0;
        for(int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a와 b를 포함해 그 사이에 있는 모든 정수의 총합을 구합니다.");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();

        System.out.println("정수 a, b 사이의 모든 정수의 총합은 " + sumOf(a, b));
    }
}
