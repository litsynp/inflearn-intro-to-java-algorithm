package s01.q01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        String str = ps.br.readLine();
        char c = ps.br.readLine().charAt(0);
        ps.sb.append(T.solution(str, c));
        ps.close();
    }

    private static class ps {
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        private static StringBuilder sb = new StringBuilder();

        public static void close() throws IOException {
            bw.write(sb.toString());
            br.close();
            bw.close();
        }
    }
}
