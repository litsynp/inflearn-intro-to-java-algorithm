package s03.q01;

import java.io.*;
import java.util.*;

public class Main {

    // 합쳐서 정렬해서 푸는 것은 인상적이지 않다.
    // Two-pointers로 해보자.

    public List<Integer> solution(int n, int[] a, int m, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        // 너무 고민하지 말고 남은 만큼 while을 더 쓰자.
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int m = Integer.parseInt(br.readLine());
        int[] b = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        StringBuilder sb = new StringBuilder();
        for (int i : T.solution(n, a, m, b)) {
            sb.append(i).append(' ');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
