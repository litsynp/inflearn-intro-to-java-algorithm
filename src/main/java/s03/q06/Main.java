package s03.q06;

import java.io.*;
import java.util.*;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) { // 0을 넘어갔다면 안정권까지 줄인다
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
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
