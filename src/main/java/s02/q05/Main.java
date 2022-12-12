package s02.q05;

import java.io.*;

public class Main {

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    // 체크만 하면 됨 (ch는 재사용 불가능(
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

//    public int solution(int n) {
//        Sieve sieve = new Sieve(n);
//        return sieve.getPrimes();
//    }
//
//    static class Sieve {
//        private final int n;
//        private final Boolean[] sieve;
//        private int primes = 0;
//
//        public Sieve(int n) {
//            // 에라토스테네스의 체를 만든다.
//            this.n = n;
//            sieve = new Boolean[n + 1];
//            sieve[0] = false;
//            sieve[1] = false;
//            sift();
//        }
//
//        private void sift() {
//            // 2부터 거른다.
//            int primes = 0;
//            for (int i = 2; i <= n; i++) {
//                if (sieve[i] != null) {
//                    continue;
//                }
//                sieve[i] = true;
//                primes++;
//                int mul = 1;
//                while (true) {
//                    mul++;
//                    int idx = i * mul;
//                    if (idx >= n + 1) break;
//                    sieve[idx] = false;
//                }
//            }
//            this.primes = primes;
//        }
//
//        public int getPrimes() {
//            return primes;
//        }
//    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(T.solution(Integer.parseInt(br.readLine()))));
        bw.close();
        br.close();
    }
}
