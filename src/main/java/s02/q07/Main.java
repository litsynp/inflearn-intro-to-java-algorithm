package s02.q07;

import java.io.*;
import java.util.*;

public class Main {

    public int solution(int n, int[] results) {
        int score = 0;
        int correctStreak = 1;

        for (int result : results) {
            if (result == 1) {
                score += correctStreak;
                correctStreak++; // 연속으로 맞추면 가산점 추가
            } else {
                correctStreak = 1; // 틀리면 초기화. 감점은 없음
            }
        }
        return score;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] results = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        bw.write(String.valueOf(T.solution(n, results)));
        bw.close();
        br.close();
    }
}
