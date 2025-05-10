package programmers.lv0;

public class 문자열겹쳐쓰기 {
    public static void main(String[] args) {
        // 예시 입력
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        // 결과 출력
        String result = solution(my_string, overwrite_string, s);
        System.out.println(result); // 출력: HelloJava
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}
