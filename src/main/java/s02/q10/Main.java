package s02.q10;

import java.io.*;
import java.util.*;

public class Main {

    // N은 50 범위 밖에 안돼서 50 * 50 검사만 하면 되므로 효율이 떨어져도 괜찮다.
    // 격자의 가장자리는 0으로 하고 [0, n-1) 범위만 검사하면 된다.
    public int solution(int n, int[][] arr) {
        int peaks = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (isPeak(arr, i, j)) peaks++;
            }
        }
        return peaks;
    }

    int[] dx = new int[]{-1, 0, 1, 0};
    int[] dy = new int[]{0, 1, 0, -1};

    // 상하좌우 숫자보다 큰 숫자를 갖는 '봉우리'인지를 검사
    public boolean isPeak(int[][] arr, int x, int y) {
        int candidate = arr[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (candidate <= arr[nx][ny]) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 0; i < n; i++) {
            int[] tmp = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < n; j++) {
                arr[i + 1][j + 1] = tmp[j];
            }
        }
        bw.write(String.valueOf(T.solution(n + 2, arr)));
        bw.close();
        br.close();
    }
}
