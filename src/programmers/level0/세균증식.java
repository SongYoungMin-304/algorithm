package programmers.level0;

public class 세균증식 {

    public int solution(int n, int t) {
        int answer = n;

        while(t>0){
            answer*=2;
            t--;
        }
        return answer;
    }

    public static void main(String[] args) {

        세균증식 a = new 세균증식();

        System.out.println(a.solution(7,15));
    }
}
