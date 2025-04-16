package programmers.lv2;

import java.util.*;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        int result = solution(clothes);

        System.out.println("의상 조합 수: " + result);
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        // 의상 종류별 개수 세기
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1]; // 의상 종류
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // 각 종류별 (선택 안 함 + 선택) 경우의 수 곱하기
        for (String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }

        return answer - 1; // 아무 것도 안 입은 경우 제외
    }
}
