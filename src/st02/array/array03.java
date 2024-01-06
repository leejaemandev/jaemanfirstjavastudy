package st02.array;

public class array03 {
    public static void main(String[] args) {
        // 깊은 복사 메서드

// 1. clone() 메서드
        int[] a = { 1, 2, 3, 4 };
        int[] b = a.clone(); // 가장 간단한 방법입니다.
// 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!
    }
}
