package programmers.level1;

public class 삼총사 {

    public int solution(int[] number) {
        int answer = 0;

        for(int a = 0; a < number.length -2 ; a++){
            for(int b =a+1; b <=number.length-1; b++){
                for(int c = b+1; c < number.length; c++){
                    if(number[a]+number[b]+number[c] == 0){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int []array = {-3, -2, -1, 0, 1, 2, 3};

        삼총사 a = new 삼총사();
        System.out.println(a.solution(array));
    }
}
