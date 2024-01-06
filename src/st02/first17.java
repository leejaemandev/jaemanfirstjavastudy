package st02;

import java.util.Scanner;

public class first17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); //출력을 제외할 구구단수 값

        //구구단
        for (int i=2; i<=9; i++) { //구구단의 첫 번째 수
            if (i == passNum) {
                continue;
            }
            for (int j=2; j<=9; j++) {
                System.out.println(i + "곱하기" + j + "는 " + (i*j) +"입니다.");
            }
        }
    }
}





