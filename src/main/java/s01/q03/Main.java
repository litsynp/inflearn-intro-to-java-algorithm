package s01.q03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

//    public String solution(String str) {
//        int m = -1;
//        String answer = "";
//
//        for (String s : str.split(" ")) {
//            if (m < s.length()) {
//                m = s.length();
//                answer = s;
//            }
//        }
//        return answer;
//    }

    // solution 2 (indexOf & substring)
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        // 마지막 처리
        if (str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(T.solution(br.readLine()));
        bw.close();
        br.close();
    }
}
