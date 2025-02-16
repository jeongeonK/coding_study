import java.util.*;

public class yuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = arr[i];
        }

        int maxSum = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i], dp[i-1] + arr[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        System.out.println(maxSum);
    }
}
