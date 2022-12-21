package s03.q03;

import java.io.*;
import java.util.*;

public class Main {

    // 이중 for문을 돌면 O(n * k)가 된다.
    // 슬라이딩 윈도우를 이용한다.
    public int solution(int n, int k, int[] arr) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];

        int max = sum;
        for (int p = k; p < n; p++) {
            sum = sum - arr[p - k] + arr[p];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] in = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = in[0];
        int k = in[1];
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        bw.write(String.valueOf(T.solution(n, k, arr)));
        bw.close();
        br.close();
    }
}
