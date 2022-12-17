package s02.q11;

import java.io.*;
import java.util.*;

public class Main {

    public int solution(int n, int[][] arr) {
        // 각 학생마다, 자신을 제외한 다른 학생과 반이 한 번이라도 겹쳤던 학생의 수를 구한다.
        int answer = 1; // 학생 번호 (가장 작은 수)
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int number = 0; number < n; number++) {
            for (int target = 0; target < n; target++) {
                for (int grade = 0; grade < 5; grade++) {
                    // 자기 자신은 제외
                    if (target == number) continue;

                    // 반이 같으면 숫자 추가
                    if (arr[number][grade] == arr[target][grade]) set.add(target);
                }
            }

            if (set.size() > max) {
                max = set.size();
                answer = number + 1;
            }

            set.clear();
        }

        // 그 학생들 중 같은 반이었던 학생 수가 가장 많은 사람이 임시 반장이 된다.
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        bw.write(String.valueOf(T.solution(n, arr)));
        bw.close();
        br.close();
    }
}
