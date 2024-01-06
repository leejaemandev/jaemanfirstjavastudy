package st02.array;

public class array06 {
    public static void main(String[] args) {
        // 반복문을 통한 초기화

        int[][] array = new int[2][3]; // 최초 선언 : array를 int[][]를 통해 2차원 배열로 선언
        // [2][3] : 첫번째 배열은 2, 두번째 배열은 3

        for (int i = 0; i < array.length; i++) { // 0과 1이 순환
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("출력값 => " + i + ", " + j);
                array[i][j] = 0;  // i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스 라고 부릅니다.
            } // 0, 1, 2가 순환
        }
    }
}
