package programmers.level0;

public class 종이자르기 {

    public int solution(int M, int N){
        int answer = 0;

        int k = M - 1;

        int k2 = M*(N-1);

        return k + k2;
    }

    public static void main(String[] args) {
        종이자르기 a = new 종이자르기();

        System.out.println(a.solution(2,5));
    }
}
