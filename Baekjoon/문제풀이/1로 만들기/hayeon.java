import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int[] d = new int[x + 1];

        for (int i = 2; i <= x; i++) {
            d[i] = d[i - 1] + 1; // 기본적으로 -1 연산 수행

            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }

            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
        }

        System.out.println(d[x]);
    }
}
