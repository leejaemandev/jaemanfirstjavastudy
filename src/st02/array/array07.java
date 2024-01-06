package st02.array;

public class array07 {
    public static void main(String[] args) {
        // 가변배열 , java에서는 2차원 배열을 생성할 때 열의 길이를 생략할 수 있음 ( [][] 첫번째 행, 두번째 열)
        int[][] array = new int[3][]; // [3][] 뒤를 비우면 가변적으로 길이를 지정할 수 있다.

        // 배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2]; // 이 array에 0번째 요소는 새로운 배열인데 길이가 2인 배열이 되는 것이다.
        array[1] = new int[4]; // 이 array에 1번째 요소는 새로운 배열인데 길이가 4인 배열이 되는 것이다.
        array[2] = new int[1]; // 이 array에 2번째 요소는 새로운 배열인데 길이가 1인 배열이 되는 것이다.

        // 중괄호로 초기화를 아예 해버릴 때도 가능
        int[][] array2 = {
                {10,20},
                {10, 20, 30, 40},
                {10}
        };

    }
}
