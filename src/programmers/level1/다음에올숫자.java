package programmers.level1;

public class 다음에올숫자 {

    public int solution(int[] common) {
        int answer = 0;
        int type;
        int k = common[0];
        int k2 = common[1];
        int k3 = common[2];

        if((k2 - k) == (k3 - k2)){
            type = 0;
        }else{
            type = 1;
        }

        if(type == 0){
            answer = common[common.length -1 ] + (k2 - k);
        }else{
            answer = common[common.length -1] * (k2/k);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
