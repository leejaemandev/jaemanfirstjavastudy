package st02.array;

import java.util.Arrays;

public class array04 {
    public static void main(String[] args) {
        // 2. Arrays.copyOf() 메서드
        int[] a = { 1, 2, 3, 4 };
        int[] b = Arrays.copyOf(a, a.length);
        // 배열과 함께 length값도 같이 넣어줍니다.
        // copyOf라는 메서드를 이용해서 a라는 배열과 a라는 배열이 가지고 있는 길이를 넣어주면 새로운 배열을 리턴해준다 (함수이기 때문!)
        // 이 과정을 통해 그 출력을 b에 담는데 그러면 a와 b는 완전히 다른 배열이 되는 것이다.

        a[3] = 0;
        System.out.println(a[3]);
        System.out.println(b[3]);
    }
}
