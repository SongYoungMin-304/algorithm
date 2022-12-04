package programmers.level0;

public class 자릿수더하기 {

    public int solution(int n) {

        int answer = 0;

        while(n > 0){
            int t = n % 10;
            n = n / 10;
            answer+=t;
        }

        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 a = new 자릿수더하기();

        System.out.println(a.solution(1234));
    }
}
