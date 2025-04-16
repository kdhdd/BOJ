package 해시;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Map -> 키(Key) - 값(Value), 2개의 타입을 명시
        // 키(Key)로 사용할 수 있는 자료형은 불변성을 가지고 있어야한다.
        // 문자열을 키(Key)로 많이 활용.
        // 숫자도 키로 활용 가능
        // 기본 자료형 사용 X, 래퍼 클래스 또는 객체
        Map<String, String> capitals = new HashMap<>();

        capitals.put("대한민국", "서울");
        capitals.put("미국", "워싱턴 D.C.");
        capitals.put("일본", "교토");
        capitals.put("중국", "베이징");
        capitals.put("백제", "위례성");
        System.out.println("초기 맵: " + capitals);

        capitals.put("일본", "도쿄");
        System.out.println("일본 수도 변경 후: " + capitals);

        System.out.println("대한민국 수도: " + capitals.get("대한민국"));
        System.out.println("독일 수도: " + capitals.get("독일"));

        System.out.println("미국 키 존재 여부: " + capitals.containsKey("미국"));

        System.out.println("프랑스 수도: " + capitals.getOrDefault("프랑스", "파리"));

        String removedValue = capitals.remove("백제");
        System.out.println("백제 삭제 후: " + capitals);
        System.out.println("삭제된 수도: " + removedValue);

        System.out.println("맵 크기: " + capitals.size());

        System.out.println("keySet 순회");
        for (String key : capitals.keySet()) {
            System.out.println("나라: " + key + ", 수도: " + capitals.get(key));
        }

        System.out.println("entrySet 순회");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("나라: " + key + ", 수도: " + value);
        }
    }
}
