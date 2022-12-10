package s01.q08;

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
//        str = str.toUpperCase(); // 대소문자 구분하지 않음
//        int lt = 0, rt = str.length() - 1;
//        while (lt < rt) {
//            // 알파벳일 경우에만 비교
//            if (!Character.isAlphabetic(str.charAt(lt))) lt++;
//            else if (!Character.isAlphabetic(str.charAt(rt))) rt--;
//            else if (str.charAt(lt) != str.charAt(rt)) return false;
//            else {
//                lt++;
//                rt--;
//            }
//        }
//
//        return true;
//    }

    public boolean isPalindrome(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
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
