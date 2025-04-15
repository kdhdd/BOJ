package programmers;

import java.util.*;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String result = solution(participant, completion);

        System.out.println("완주하지 못한 사람: " + result);
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 완주자 목록 저장
        for (String complete : completion) {
            map.put(complete, map.getOrDefault(complete, 0) + 1);
        }

        // 참가자 중 완주하지 못한 사람 찾기
        for (String partici : participant) {
            if (map.getOrDefault(partici, 0) == 0) {
                return partici;
            }
            map.put(partici, map.get(partici) - 1);
        }

        return null; // 모든 사람이 완주했다면 null 반환
    }
}
