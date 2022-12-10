package s01.q11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

//    public String solution(String str) {
//        StringBuilder sb = new StringBuilder();
//        Stack<Character> stack = new Stack<>();
//        for (char c : str.toCharArray()) {
//            if (stack.peek() == c) {
//                stack.add(c);
//            } else {
//                sb.append(stack.peek());
//                if (stack.size() > 1) {
//                    sb.append(stack.size());
//                }
//                stack.removeAllElements();
//                stack.add(c);
//            }
//        }
//
//        sb.append(stack.peek());
//        if (stack.size() > 1) {
//            sb.append(stack.size());
//        }
//
//        return sb.toString();
//    }

//    public String solution(String str) {
//        str = str + " "; // 마지막 처리 편의를 위한 빈 문자열
//        StringBuilder sb = new StringBuilder();
//        char cur = 0;
//        int count = 0;
//        for (char c : str.toCharArray()) {
//            if (count == 0) {
//                cur = c;
//                count++;
//            } else if (cur == c) {
//                count++;
//            } else {
//                sb.append(cur);
//                if (count > 1) {
//                    sb.append(count);
//                }
//                cur = c;
//                count = 1;
//            }
//        }
//        return sb.toString();
//    }

    public String solution(String str) {
        str = str + " "; // 마지막 처리 편의를 위한 빈 문자열
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) sb.append(count);
                count = 1;
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
