package s01.q04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    public List<String> solution(List<String> str) {
//        List<String> answers = new ArrayList<>();
//
//        // 일일히 뒤집는 게 아니라 한번에 다 뒤집으면 된다면 StringBuilder의 reverse()를 쓰자.
//        for (String x : str) answers.add(new StringBuilder(x).reverse().toString());
//
//        return answers;
//    }

    // 직접 변경하기
    public List<String> solution(List<String> str) {
        List<String> answers = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answers.add(tmp);
        }

        return answers;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < N; i++) inputs.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (String answer : T.solution(inputs)) {
            sb.append(answer).append('\n');
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
