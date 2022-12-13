package s02.q08;

import java.io.*;
import java.util.*;

public class Main {

//    public List<Integer> solution(int n, int[] scores) {
//        PriorityQueue<Triple> scoreSetByScore = new PriorityQueue<>(Comparator.comparingInt(Triple::getScore).reversed());
//        for (int i = 0; i < n; i++) {
//            scoreSetByScore.add(new Triple(i, scores[i]));
//        }
//
//        PriorityQueue<Triple> scoreSetByIdx = new PriorityQueue<>(Comparator.comparingInt(Triple::getIdx));
//        int score = scoreSetByScore.peek().getScore();
//        int rank = 1;
//        int sameRank = 1; // 같은 등수일 경우의 등수를 기억
//        while (!scoreSetByScore.isEmpty()) {
//            Triple t = scoreSetByScore.poll();
//
//            if (t.getScore() != score) { // 점수가 다르면 등수를 내린다.
//                sameRank = rank;
//                t.setRank(rank);
//            } else {
//                t.setRank(sameRank);
//            }
//            scoreSetByIdx.add(t);
//            score = t.getScore();
//            rank++;
//        }
//
//        List<Integer> answer = new ArrayList<>();
//        while (!scoreSetByIdx.isEmpty()) {
//            Triple t = scoreSetByIdx.poll();
//            answer.add(t.getRank());
//        }
//        return answer;
//    }
//
//    static class Triple {
//        private int idx;
//        private int score;
//        private int rank;
//
//        Triple(int idx, int score) {
//            this.idx = idx;
//            this.score = score;
//        }
//
//        int getScore() {
//            return score;
//        }
//
//        int getIdx() {
//            return idx;
//        }
//
//        int getRank() {
//            return rank;
//        }
//
//        void setRank(int rank) {
//            this.rank = rank;
//        }
//    }

    // 어차피 N의 범위는 3부터 100이라서 최악의 경우에도 10000번 반복 밖에 안된다
    // => 2중 for문.
    // 자연스럽게 점수가 같으면 같은 등수를 갖는다.
    public int[] solution(int n, int[] scores) {
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (scores[i] < scores[j]) rank++;
            }
            ranks[i] = rank;
        }
        return ranks;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] scores = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (int rank : T.solution(n, scores)) {
            sb.append(rank).append(' ');
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
