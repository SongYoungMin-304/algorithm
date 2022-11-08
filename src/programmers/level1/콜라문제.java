package programmers.level1;

public class 콜라문제 {

    public int solution(int a, int b, int n) {
        int answer = 0;
        // a 빈병 몇개를 줘야지 2
        // b 새로운 병을 줄 것인가 1
        // n 이거는 콜라의 수 20

        while(true) {
            int k = n / a;

            if(k == 0){
                break;
            }

            answer+=(k*b);

            int k2 = n % a;
            n = k*b + k2;

        }

        return answer;
    }

    public static void main(String[] args) {
        콜라문제 a = new 콜라문제();

        System.out.println(a.solution(3,1,20));
    }
}
