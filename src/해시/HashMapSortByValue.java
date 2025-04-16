package 해시;

import java.util.*;

public class HashMapSortByValue {

    public static void main(String[] args) {
        HashMap<String, Integer> fruitCounts = new HashMap<>();
        fruitCounts.put("바나나", 5000);
        fruitCounts.put("사과", 3000);
        fruitCounts.put("오렌지", 8000);
        fruitCounts.put("포도", 6000);

        // 1. Map의 Entry Set을 List로 변환
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(fruitCounts.entrySet());

        // 2. List를 값(Value - 개수) 기준으로 내림차순 정렬 (람다식 Comparator 사용)
        // getValue()로 값 비교, 내림차순
        entryList.sort((e1, e2) -> e2.getValue() - e1.getValue());

        System.out.println(entryList);
    }
}
