package programmers.level0;

public class n의배수고르기 {

    public int[] solution(int n, int[] numlist) {

        int size = 0;
        int t = 0;

        for(int a : numlist){
            if(a%n == 0){
                size++;
            }
        }

        int[] answer = new int[size];

        for(int a : numlist){
            if(a%n == 0){
                answer[t++] = a;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
