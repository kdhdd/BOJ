package programmers.lv1;

public class 동영상재생기 {
    public static void main(String[] args) {
        String video_len = "34:33";  // 1분
        String pos = "13:00";        // 시작 위치
        String op_start = "00:55";   // 광고 시작
        String op_end = "02:55";     // 광고 끝
        String[] commands = {"next", "prev"};

        String result = solution(video_len, pos, op_start, op_end, commands);

        System.out.println("최종 위치: " + result);
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = parseTime(video_len);       // 전체 영상 시간(초)
        int p = parseTime(pos);                 // 현재 위치
        int op_s = parseTime(op_start);         // 광고 시작
        int op_e = parseTime(op_end);           // 광고 끝

        // 초기 광고 구간에 걸쳐 있으면 광고 끝으로 이동
        if (p >= op_s && p <= op_e)
            p = op_e;

        for (String command : commands) {
            if (command.equals("prev")) {
                p = Math.max(0, p - 10);
            } else { // next
                p = Math.min(video, p + 10);
            }

            // 이동 후 광고 구간에 들어가면 강제로 광고 끝으로 점프
            if (p >= op_s && p <= op_e)
                p = op_e;
        }

        int mm = p / 60;
        int ss = p % 60;

        String m = String.valueOf(mm);
        if (m.length() < 2)
            m = "0" + m;

        String s = String.valueOf(ss);
        if (s.length() < 2)
            s = "0" + s;

        return m + ":" + s;
    }

    // "MM:SS" → 초 단위 정수로 변환
    private static int parseTime(String times) {
        String[] timeArr = times.split(":");
        return Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);
    }
}
