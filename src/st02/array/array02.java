package st02.array;

import java.util.Arrays;

public class array02 {
    public static void main(String[] args) {

        // 향상된 for문
        int[] intArr = {10, 20, 30, 40, 50};

        // 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);

        for (int item: intArr)
            System.out.println(item);
    }
}
