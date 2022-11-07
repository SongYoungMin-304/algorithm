package programmers.level1;

public class 옹알이 {

    public int solution(String[] babbling) {
        int answer = 0;

        String [] dupList = {
                "ayaaya",
                "yeye",
                "woowoo",
                "mama"
        };

        String [] list ={
                "aya",
                "ye",
                "woo",
                "ma"
        };

        for(String k : babbling){

            for(String dup : dupList){
                k = k.replace(dup,"x");
            }

            for(String l : list){
                k = k.replace(l,"?");
            }

            System.out.println(k);

            int sign = 0;

            for(int q = 0; q < k.length(); q++){
                if(!k.subSequence(q,q+1).equals("?")){
                    sign = 1;
                    break;
                }
            }

            if(sign == 0 ){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        옹알이 a = new 옹알이();

        String [] list = {"aya"};

        a.solution(list);
    }

}
