package programmers.lv1;

public class 붕대감기 {
    public static void main(String[] args) {
        // 테스트 데이터 입력
        int[] bandage = {5, 1, 5}; // [시전 시간, 초당 회복량, 추가 회복량]
        int health = 30;           // 초기 체력
        int[][] attacks = {        // [공격 시간, 피해량]
                {2, 10},
                {9, 15},
                {10, 5},
                {11, 5}
        };

        int result = solution(bandage, health, attacks);

        System.out.println("최종 체력 (또는 -1 if 죽음): " + result);
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int nowHealth = health;
        int maxTime = attacks[attacks.length - 1][0]; // 마지막 공격 시간

        int count = 0; // 연속 회복 카운트
        int index = 0; // 공격 인덱스

        for (int i = 1; i <= maxTime; i++) {
            if (index < attacks.length && attacks[index][0] == i) {
                // 공격이 있는 시간
                nowHealth -= attacks[index][1];
                if (nowHealth <= 0) return -1; // 체력 0 이하
                index++;
                count = 0; // 연속 회복 초기화
            } else {
                // 회복 시간
                count++;

                if (count == bandage[0]) {
                    // 시전 완료 → 추가 회복 적용
                    nowHealth = Math.min(health, nowHealth + bandage[1] + bandage[2]);
                    count = 0;
                } else {
                    // 일반 회복
                    nowHealth = Math.min(health, nowHealth + bandage[1]);
                }
            }
        }

        return nowHealth;
    }
}

