package chap01.ex;
import java.util.Scanner;
public class DigitsNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        System.out.println("양의 정숫값의 자릿수를 구합니다.");

//        int digits;
//        while(true) {
//            int num = stdIn.nextInt();
//
//            String s = Integer.toString(num);
//            digits = s.length();
//            if(num > 0) break;
//        }
//        System.out.println("그 수는 " + digits + "자리입니다.");

        int n;
        do {
            System.out.print("정숫값 : ");
            n = stdIn.nextInt();
        } while(n <= 0);

        int digits = 0;
        while(n > 0) {
            n /= 10;
            digits++;
        }

        System.out.println("그 수는 " + digits + "자리입니다.");

    }
}
