package s02.q12;

import java.io.*;
import java.util.*;

public class Main {

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int number = 1; number <= n; number++) {
            Set<Integer> mentees = new HashSet<>();

            // 0번 시험
            int mentorRank = n - 1;
            for (int rank = 0; rank < n; rank++) {
                if (number == arr[0][rank]) {
                    mentorRank = rank;
                    continue;
                }

                if (rank > mentorRank) mentees.add(arr[0][rank]);
            }

            // 1~m번 시험
            for (int exam = 1; exam < m; exam++) {
                mentorRank = n - 1;
                for (int rank = 0; rank < n; rank++) {
                    if (number == arr[exam][rank]) {
                        mentorRank = rank;
                        continue;
                    }

                    if (rank <= mentorRank) mentees.remove(arr[exam][rank]);
                }
            }
            answer += mentees.size();
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nm = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = nm[0];
        int m = nm[1];
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        bw.write(String.valueOf(T.solution(n, m, arr)));
        bw.close();
        br.close();
    }
}
