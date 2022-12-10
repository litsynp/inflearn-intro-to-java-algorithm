package s01.q05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public String solution(String str) {
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(str.charAt(lt))) lt++;
            else if (!Character.isAlphabetic(str.charAt(rt))) rt--;
            else {
                s = swap(s, lt, rt);
                lt++;
                rt--;
            }
        }

        return String.valueOf(s);
    }

    char[] swap(char[] str, int lt, int rt) {
        char tmp = str[lt];
        str[lt] = str[rt];
        str[rt] = tmp;
        return str;
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
