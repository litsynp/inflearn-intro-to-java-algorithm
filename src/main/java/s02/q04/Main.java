package s02.q04;

import java.io.*;

public class Main {

    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) arr[i] = arr[i - 1] + arr[i - 2];
        return arr;
    }

    // 바로 출력
//    public void solution(int n) {
//        int a = 1, b = 1, c;
//        System.out.println(a + " " + b + " ");
//        for (int i = 2; i < n; i++) {
//            c = a + b;
//            System.out.println(c + " ");
//            a = b;
//            b = c;
//        }
//    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int x : T.solution(Integer.parseInt(br.readLine()))) sb.append(x).append(' ');
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
