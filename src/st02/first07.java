package st02;

public class first07 {
    public static void main(String[] args) {

        int intNumber = 97 + (int)98.8;
        System.out.println(intNumber);

        double doubleNumber = 97 +(double)98.8;
        System.out.println(doubleNumber);

        int x = 1;
        int y = 9;

        boolean b = ( x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);

        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x > y) ? y : x;
        System.out.println(min);
    }
}
