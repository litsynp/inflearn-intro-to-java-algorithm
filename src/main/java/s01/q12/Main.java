package s01.q12;

import java.io.*;

public class Main {

    // 왜인지 모르겠으나 아래 솔루션은 COOL 케이스가 틀렸다고 나온다. (?)
    // Stream으로 풀긴 했으나 너무 길어서... 그냥 절차지형으로 가는 게 좋을 것 같다.
//    public String solution(int n, String s) {
//        return splitSeven(s).stream() // 7마다 잘린 결과마다
//                .map(this::toBinary) // 1000001 등 이진수로 바꿔서
//                .map(this::toDecimal) // 65 등 십진수로 바꿔서
//                .map(i -> {
//                    int v = i;
//                    return Character.toString((char) v);
//                }) // 문자로 바꿔서
//                .collect(Collectors.joining()); // 합친다
//    }
//
//    public List<String> splitSeven(String s) {
//        List<String> strings = new ArrayList<>();
//        for (int i = 0; i < s.length(); i += 7) {
//            // 7개마다 자른다.
//            strings.add(s.substring(i, Math.min(i + 7, s.length())));
//        }
//        return strings;
//    }
//
//    public String toBinary(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '#') sb.append(1);
//            else sb.append(0);
//        }
//        return sb.toString();
//    }
//
//    public int toDecimal(String s) {
//        int num = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '1') num += (int) Math.pow(2, s.length() - 1 - i);
//        }
//        return num;
//    }

    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        bw.write(T.solution(n, s));
        bw.close();
        br.close();
    }
}
