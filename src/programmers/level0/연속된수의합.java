package programmers.level0;

public class 연속된수의합 {

    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        // 3 12     3 4 5

        int start = 0;
        int value;
        int sum = 0;

        while(true){

            value = start;

            sum = 0;
            for(int a = 0; a < num; a++){
                sum+=value;
                answer[a] = value;
                value+=1;
            }

            if(total > sum){
                start++;
            }else if(total < sum){
                start--;
            }else{
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 12;

        int []array = {3,4,5};

        연속된수의합 c = new 연속된수의합();

        int [] answer = c.solution(5,5);

        for(int w : answer){
            System.out.println("흠");
            System.out.println(w);
        }
    }
}
