package s01.q06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

//    public String solution(String str) {
//        Set<Character> set = new HashSet<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : str.toCharArray()) {
//            if (!set.contains(c)) {
//                sb.append(c);
//                set.add(c);
//            }
//        }
//
//        return sb.toString();
//    }

    String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == str.indexOf(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
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
