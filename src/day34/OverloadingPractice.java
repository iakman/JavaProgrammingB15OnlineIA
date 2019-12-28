package day34;

public class OverloadingPractice {
    public static void main(String[] args) {
        add(1222);
        add(10, 30);
        add(56,78,90);
        add(78365L,52);

    }

    public static void add(int num) {

        System.out.println(num + 100);
    }

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(long z, long v) {
        System.out.println("long : " + (z + v));
    }
}
