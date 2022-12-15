package s02.q09;

import java.io.*;
import java.util.*;

public class Main {

    public int solution(int n, int[][] grid) {
        int max = 0;
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                // row별로 계산
                sum1 += grid[i][j];
                // column별로 계산 계산
                sum2 += grid[j][i];
            }
            // 좌->우 대각선 계산
            sum3 += grid[i][i];
            // 우->좌 대각선 계산
            sum4 += grid[i][n - i - 1];

            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
            max = Math.max(max, sum3);
            max = Math.max(max, sum4);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        bw.write(String.valueOf(T.solution(n, grid)));
        bw.close();
        br.close();
    }
}
