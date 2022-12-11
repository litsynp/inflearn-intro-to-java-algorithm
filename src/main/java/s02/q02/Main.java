package s02.q02;

import java.io.*;
import java.util.*;

public class Main {

    public int solution(int n, int[] heights) {
        int answer = 1;
        int max = heights[0];
        for (int i = 1; i < n; i++) {
            // 이전에 있던 사람들보다 키 큰 사람이어야 볼 수 있다
            if (max < heights[i]) {
                max = heights[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] heights = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        bw.write(String.valueOf(T.solution(n, heights)));
        br.close();
        bw.close();
    }
}
