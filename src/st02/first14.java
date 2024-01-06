package st02;

public class first14 {
    public static void main(String[] args) {
        int month = 1;
        String monthString = "";

        switch (month) {
            case 1:
                monthString = "1월";
                break;
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            default:
                monthString = "알 수 없음";
        }
        System.out.println(monthString);
    }
}
