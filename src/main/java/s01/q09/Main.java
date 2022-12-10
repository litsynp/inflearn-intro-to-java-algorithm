package s01.q09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

//    public int solution(String str) {
//        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
//    }

//    public int solution(String str) {
//        int answer = 0;
//        for (char x : str.toCharArray()) {
//            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
//        }
//        return answer;
//    }

    public int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(T.solution(br.readLine())));
        bw.close();
        br.close();
    }
}
