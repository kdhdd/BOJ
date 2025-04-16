package 해시;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSortByKey {

    public static void main(String[] args) {
        Map<String, Integer> fruitCounts = new HashMap<>();
        fruitCounts.put("바나나", 5000);
        fruitCounts.put("사과", 3000);
        fruitCounts.put("오렌지", 8000);
        fruitCounts.put("포도", 6000);

        System.out.println("정렬 전 맵: " + fruitCounts);

        // 1. 키만 추출하여 List 생성
        List<String> fruitNames = new ArrayList<>(fruitCounts.keySet());

        // 2. 키 List를 정렬
        fruitNames.sort(null);

        System.out.println(fruitNames);
    }
}
