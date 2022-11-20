package skillcheck;

public class No1 {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int k  = 0;

        while(n > 0){
            int t = (int) (n%10);
            n = n/10;
            answer[k++] = t;
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;

        No1 no1 = new No1();
        int []answer = no1.solution(n);

        for(int a : answer){
            System.out.println(a);
        }


    }
}
