package st02.array;

public class array05 {
    public static void main(String[] args) {
        // 문자 (char / 1byte), 문자열 (String)
        // String = char[]

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작함' 반면, 참조형 변수는 '대문자로 시작함'
        // - Wrapper class에서 기본형 변수를 감싸줄 때(boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(= 주소형 변수)

        // char < String
        // String이 가지고 있는 기능이 너무 많아서!
        // Wrapper class와도 상당히 비슷 -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper을 감쌈으로써, 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength);

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substring(int fromIdx, int toIdx) : String을 자르겠다

        String strSub = str.substring(0, 3); // 0부터 2까지 (3전까지!)
        System.out.println(strSub);

        // (4) equals(String str) : true or false 값이 리턴
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str); // newStr이 우리가 가지고 있었던 str과 일치하냐? true / 만약 String newStr = "ABCE"; 면 false
        System.out.println(strEqual);

        // (5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        // (6) 반대로 char[] -> String ->
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // new String 키워드 하나로 charArray를 charArrayString으로 변경 할 수 있음
        System.out.println(charArrayString);
    }
}
