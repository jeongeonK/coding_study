import java.util.Scanner;

public class hayeon {
    static int[][] dp = new int[100001][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        dp[1][0] = 1; dp[1][1] = 0; dp[1][2] = 0;
        dp[2][0] = 0; dp[2][1] = 1; dp[2][2] = 0;
        dp[3][0] = 1; dp[3][1] = 1; dp[3][2] = 1;

        for (int i = 4; i <= 100000; i++) {
            dp[i][0] = (dp[i - 1][1] + dp[i - 1][2]) % 1000000009;
            dp[i][1] = (dp[i - 2][0] + dp[i - 2][2]) % 1000000009;
            dp[i][2] = (dp[i - 3][0] + dp[i - 3][1]) % 1000000009;
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int result = ((dp[n][0] + dp[n][1]) % 1000000009 + dp[n][2]) % 1000000009;
            System.out.println(result);
        }

        sc.close();
    }
    
}
