package s02.q01;

import java.io.*;
import java.util.*;

public class Main {
    public List<Integer> solution(int n, int[] nums) {
        List<Integer> answers = new ArrayList<>();
        answers.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) answers.add(nums[i]);
        }
        return answers;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        bw.write(T.toString(T.solution(n, nums)));
        bw.close();
        br.close();
    }

    public String toString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) sb.append(num).append(" ");
        return sb.toString();
    }
}
