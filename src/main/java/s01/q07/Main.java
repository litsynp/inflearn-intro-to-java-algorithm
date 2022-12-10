package s01.q07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public String solution(String str) {
        return isPalindrome(str) ? "YES" : "NO";
    }

//    public boolean isPalindrome(String str) {
//        str = str.toLowerCase(); // 대소문자 구분하지 않습니다.
//        int lt = 0, rt = str.length() - 1;
//        while (lt < rt) {
//            if (str.charAt(lt) != str.charAt(rt)) return false;
//            lt++;
//            rt--;
//        }
//        return true;
//    }

//    public boolean isPalindrome(String str) {
//        str = str.toLowerCase(); // 대소문자 구분하지 않습니다.
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - 1 - i)) return false;
//        }
//        return true;
//    }

    boolean isPalindrome(String str) {
        String tmp = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(tmp);
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
