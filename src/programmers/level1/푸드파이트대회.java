package programmers.level1;

public class 푸드파이트대회 {

    public String solution(int[] food) {
        String answer = "";

        for(int a = 1; a < food.length; a++){
            // a
            // food[a]
            int t = food[a];
            int t2 = t/2;
            while(t2 > 0){
                answer+=String.valueOf(a);
                t2--;
            }
        }

        char []list = new char[answer.length()];

        for(int b = 0; b < answer.length(); b++){
            list[b] = answer.charAt(answer.length() -b -1);
        }

        String answer2= new String(list);

        answer+="0";
        answer+=answer2;

        return answer;
    }

    public static void main(String[] args) {
        푸드파이트대회 a = new 푸드파이트대회();

        int []food ={1,3,4,6};

        System.out.println(a.solution(food));
    }
}
