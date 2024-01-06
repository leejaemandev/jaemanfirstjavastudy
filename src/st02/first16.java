package st02;

public class first16 {
    public static void main(String[] args) {
        int number1 = 0;
        while (number1 < 3) {
            number1++;
            System.out.println(number1 + " 출력!");
        }

        System.out.println("--------------");

        int number2 = 4;
        do {
            System.out.println(number2 + " 출력!");
        }while (number2 < 3);

        System.out.println("-------------------");

        int number3 = 0;
        while (number3 < 3) {
            number3++;
            if (number3 == 2) {
                break;
            }
            System.out.println(number3 + " 출력!!");
        }

        System.out.println("--------------------------------");

        for (int i=0; i<10; i++ ) {
            System.out.println("i: " + i);
            if (i == 2) {
                break;
            }
            for (int j=0; j<10; j++) {
                System.out.println("j: " + j);
                if(j == 2){
                    break;
                }

            }
        }

        System.out.println("-----------------------------");

        int number4 = 0;
        while (number4 < 3) {
            number4++;
            if (number4 == 2) {
                continue;
            }
            System.out.println(number4 + " 출력!");
        }
    }
}
