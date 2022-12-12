package s02.q06;

import java.io.*;
import java.util.*;

public class Main {

//    public List<Integer> solution(int n, int[] nums) {
//        int max = 0;
//        int[] reversed = new int[n];
//        for (int i = 0; i < n; i++) {
//            reversed[i] = reverse(nums[i]);
//        }
//
//        for (int num : reversed) {
//            max = Math.max(max, num);
//        }
//
//        Sieve sieve = new Sieve(max + 1);
//        List<Integer> answer = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (sieve.isPrime(reversed[i])) answer.add(reversed[i]);
//        }
//        return answer;
//    }
//
//    public int reverse(int x) {
//        return Integer.parseInt(new StringBuilder(String.valueOf(x))
//                .reverse()
//                .toString()
//                .replaceAll("^0+", ""));
//    }
//
//    static class Sieve {
//        private final Boolean[] sieve;
//
//        public Sieve(int n) {
//            sieve = new Boolean[n + 1];
//            sieve[0] = false;
//            sieve[1] = false;
//            for (int i = 2; i <= n; i++) {
//                if (sieve[i] == null) sieve[i] = true;
//                for (int j = i; j <= n; j += i) {
//                    if (sieve[j] == null) sieve[j] = false;
//                }
//            }
//        }
//
//        public boolean isPrime(int x) {
//            return sieve[x];
//        }
//    }

    public List<Integer> solution(int n, int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = reverse(nums[i]);
            if (isPrime(num)) answer.add(num);
        }
        return answer;
    }

    public int reverse(int x) {
        int res = 0;
        while (x > 0) {
            int t = x % 10;
            res = res * 10 + t;
            x /= 10;
        }
        return res;
    }

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (int x : T.solution(n, nums)) {
            sb.append(x).append(' ');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
