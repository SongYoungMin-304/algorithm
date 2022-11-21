package programmers.level0;

public class 칠의개수 {

    public int solution(int[] array) {
        int answer = 0;

        for(int a : array){
            answer+=caculate(a);
        }
        return answer;
    }

    public int caculate(int a){
        int answer = 0;
        int remain;

        while(a>0){
            remain = a%10;
            a = a/10;

            if(remain == 7){
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        칠의개수 a = new 칠의개수();

        int []array = {7,77,17};

        System.out.println(a.solution(array));
    }
}
