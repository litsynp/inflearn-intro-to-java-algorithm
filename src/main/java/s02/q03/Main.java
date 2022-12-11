package s02.q03;

import java.io.*;
import java.util.*;

public class Main {

    public String[] solution(int n, int[] rpsOfA, int[] rpsOfB) {
        String[] answers = new String[n];

        for (int i = 0; i < n; i++) {
            switch (play(rpsOfA[i], rpsOfB[i])) {
                case WIN:
                    answers[i] = "A";
                    break;
                case LOSE:
                    answers[i] = "B";
                    break;
                case DRAW:
                default:
                    answers[i] = "D";
            }
        }
        return answers;
    }

    static class RockPaperScissors {
        public static final int SCISSORS = 1;
        public static final int ROCK = 2;
        public static final int PAPER = 3;
    }

    enum RpsResult {
        WIN, LOSE, DRAW,
    }

    public RpsResult play(int a, int b) {
        if (a == b) {
            return RpsResult.DRAW;
        }

        switch (a) {
            case RockPaperScissors.SCISSORS:
                if (b == RockPaperScissors.ROCK) return RpsResult.LOSE;
                return RpsResult.WIN;
            case RockPaperScissors.ROCK:
                if (b == RockPaperScissors.SCISSORS) return RpsResult.WIN;
                return RpsResult.LOSE;
            case RockPaperScissors.PAPER:
            default:
                if (b == RockPaperScissors.SCISSORS) return RpsResult.LOSE;
                return RpsResult.WIN;
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] rpsOfA = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] rpsOfB = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (String s : T.solution(n, rpsOfA, rpsOfB)) {
            sb.append(s).append('\n');
        }
        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}
