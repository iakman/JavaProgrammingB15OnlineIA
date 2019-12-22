package day32;

public class NumberAction {
    public static void main(String[] args) {
        numberComparasion(10, 45);
        numberComparasion(50, 30);
        numberComparasion(5, 5);
        evenNumbersFrom50to0();
        print1toX(10);
        skipCountBy3From0to50();
        repeatString("akman", 5);
        System.out.println();
        countDownByEvenNumbersFromxtoy(100, 60);

    }

    public static void numberComparasion(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("num1 is more than num2");
        } else if (num2 > num1) {
            System.out.println("num2 is more than num1");
        } else {
            System.out.println("numbers are same");
        }

    }

    public static void evenNumbersFrom50to0() {
        countDownByEvenNumbersFromxtoy(50,0);
//        for (int i = 50; i >= 0; i--) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
    }

    public static void print1toX(int x) {
//        print1toX
//    create a method that has 1 int parameter called x
// *print from 1 to that number in one line
//  print an empty line after the print.
        System.out.println("Print 1 to " + x);
        for (int i = 1; i <= x; i++) {

            System.out.print(i + " ");
        }

    }

    public static void skipCountBy3From0to50() {
        System.out.println();
        for (int i = 0; i <= 50; i += 3) {
            System.out.print(i + " ");
        }


    }


    public static void repeatString(String strToRepeat, int count) {
        System.out.println();
        for (int i = 1; i <= count; i++) {
            System.out.print(strToRepeat + " ");

//            if (i <= count) {
//                System.out.println(strToRepeat);
//            }
        }
    }

    public static void countDownByEvenNumbersFromxtoy(int x, int y) {
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }




}
