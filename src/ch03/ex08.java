package ch03;

public class ex08 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        long c = a * b;
        System.out.println(c);
        c = (long) a * b;
        System.out.println(c);
    }
}
