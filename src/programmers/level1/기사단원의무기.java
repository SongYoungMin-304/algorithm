package programmers.level1;


public class 기사단원의무기 {

    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int a = 1; a<=number; a++){
            answer+=check(a, limit, power);
        }
        return answer;
    }

    public int check(int a, int limit, int power){
        int answer = 0;
        for(int k = 1; k*k<=a; k++){
            if(a%k==0){
                answer++;

                if(k*k < a){
                    answer++;
                }
            }
        }

        int result = answer > limit ? power : answer;
        return result;
    }

    public static void main(String[] args) {

    }
}
