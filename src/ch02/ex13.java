package ch02;

public class ex13 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) 10;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        b = 10;
        i = (int) b;
        System.out.printf("[byte -> int] b = %d -> i = %d%n", i, b);

        b = -2;
        i = (int) b;
        System.out.printf("[byte -> int] b = %d -> i = %d%n", i, b);
    }
}
