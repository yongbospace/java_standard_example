package ch03;

public class ex02 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        j = i++;
        System.out.println("j=i++; 실행후., i=" + i + ", j=" + j);

        i = 5;
        j = 0;
        j = ++i;
        System.out.println("j=i++; 실행후., i=" + i + ", j=" + j);

    }
}
