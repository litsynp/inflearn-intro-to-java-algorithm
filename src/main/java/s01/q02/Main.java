package s01.q02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) sb.append(Character.toUpperCase(x));
            else sb.append(Character.toLowerCase(x));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        bw.write(T.solution(str));
        bw.close();
        br.close();
    }
}
