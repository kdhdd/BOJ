package programmers.lv1;

import java.util.HashMap;

public class 성격유형검사하기 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String result = solution(survey, choices);

        System.out.println("성격 유형 결과: " + result);
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();

        char[][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> point = new HashMap<>();

        for (char[] t : type) {
            point.put(t[0], 0);
            point.put(t[1], 0);
        }

        for (int i = 0; i < choices.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);

            if (choices[i] > 4) {
                point.put(right, point.get(right) + score[choices[i]]);
            } else if (choices[i] < 4) {
                point.put(left, point.get(left) + score[choices[i]]);
            }
        }

        for (char[] t : type) {
            answer.append(point.get(t[1]) <= point.get(t[0]) ? t[0] : t[1]);
        }

        return answer.toString();
    }
}
