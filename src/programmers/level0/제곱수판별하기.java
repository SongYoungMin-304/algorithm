package programmers.level0;

public class 제곱수판별하기 {

    public int solution(int n) {
        int answer = 2;

        for(int a = 0; a * a <= n; a++){
            if(a * a == n){
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        제곱수판별하기 a = new 제곱수판별하기();

        System.out.println(a.solution(1244));
    }
}
