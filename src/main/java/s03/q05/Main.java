package s03.q05;

import java.io.*;

public class Main {

//    1. Two pointers
//    public int solution(int n) {
//        int answer = 0, sum = 0, lt = 0;
//
//        // n / 2까지만 구하면 된다.
//        int m = n / 2 + 1;
//        int[] arr = new int[m];
//
//        for (int i = 0; i < m; i++) arr[i] = i + 1;
//
//        for (int rt = 0; rt < m; rt++) {
//            sum += arr[rt];
//            if (sum == n) answer++;
//            while (sum >= n) {
//                sum -= arr[lt++];
//                if (sum == n) answer++;
//            }
//        }
//        return answer;
//    }

    // 2. Mathematical
    public int solution(int n) {
        int answer = 0, cnt = 2; // 5 이상의 자연수는 연속된 자연수 2개의 합은 무조건 된다
        n--;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) answer++;
        }

        return answer;
    }

//    public int solution(int n) {
//        int answer = 0;
//        for (int i = 1; i < n - 1; i++) {
//            int sum = i;
//            for (int j = i + 1; j < n; j++) {
//                sum += j;
//
//                if (sum == n) {
//                    answer++;
//                    break;
//                } else if (sum > n) break;
//            }
//        }
//        return answer;
//    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(T.solution(n)));
        bw.close();
        br.close();
    }
}
