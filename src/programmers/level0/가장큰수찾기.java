package programmers.level0;

public class 가장큰수찾기 {

    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = 0;
        int t = 0;
        for(int a = 0; a < array.length; a++){
            if(array[a]>max){
                max = array[a];
                t = a;
            }
        }

        answer[0] = max;
        answer[1] = t;

        return answer;
    }


    public static void main(String[] args) {

        가장큰수찾기 a = new 가장큰수찾기();

        int [] array = {1,8,3};

        int []answer = a.solution(array);

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
