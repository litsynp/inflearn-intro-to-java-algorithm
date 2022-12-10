package s01.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

//    public int[] solution(String s, char t) {
//        // t가 있는 곳의 위치를 모두 찾는다.
//        List<Integer> poses = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == t) poses.add(i);
//        }
//
//        int[] answer = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            int nearestLower = Math.abs(poses.get(0) - i);
//            int nearestHigher = Math.abs(poses.get(poses.size() - 1) - i);
//
//            for (int j = 0; j < poses.size(); j++) {
//                int curPos = poses.get(j);
//                if (i < curPos) {
//                    nearestHigher = Math.abs(curPos - i);
//                    break;
//                }
//                nearestLower = Math.abs(curPos - i);
//            }
//            answer[i] = (Math.min(nearestHigher, nearestLower));
//        }
//        return answer;
//    }

    public int[] solution(String s, char t) {
        // Left
        int p = 1000;
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = 0;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // Right
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public String listToString(int[] list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            sb.append(list[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        String s = input[0];
        char t = input[1].charAt(0);
        bw.write(T.listToString(T.solution(s, t)));
        bw.close();
        br.close();
    }
}
