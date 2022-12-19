package s03.q02;

import java.io.*;
import java.util.*;

public class Main {

    // Two pointers - (오름차순) 정렬을 시켜야 한다.
    public List<Integer> solution(int n, int[] a, int m, int[] b) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] < b[p2]) p1++;
            else p2++;
        }

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
        for (int x : T.solution(n, a, m, b)) {
            sb.append(x).append(' ');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
