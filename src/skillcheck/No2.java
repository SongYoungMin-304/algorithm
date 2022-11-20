package skillcheck;

public class No2 {

    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 2 3 2 4 2 4 3 4

    // 1 2 3 4 5
    // 1 2 2 3 2

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int sum;

        for(int a = 0; a <= number; a++){
            sum = caculdate(a, limit, power);
            answer +=sum;
        }

        return answer;
    }

    public int caculdate(int k, int limit, int power){
        int answer = 0;
        for(int a = 1; a * a <= k; a++){
            if(k%a==0){
                answer++;

                if(a * a < k){
                    answer++;
                }
            }
            if(answer > limit){
                return power;
            }
        }
        return answer;
    }

    // 1 5 25 125

    public static void main(String[] args) {
        No2 no2 = new No2();

    }
}
