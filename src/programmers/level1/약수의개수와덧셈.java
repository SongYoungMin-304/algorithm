package programmers.level1;

public class 약수의개수와덧셈 {

//    left	right	result
///     13	   17	    43
//      24	   27	    52


    public int solution(int left, int right) {

        int answer = 0;

        for(int k = left; k <= right; k++){
            answer +=caculate(k);
        }

        return answer;
    }

    public int caculate(int k){
        int count = 0;
        for(int a = 1; a <=k; a++){
            if(k%a==0){
                count++;
            }
        }
        if(count%2==1){
            k = -k;
        }
        return k;
    }

    public static void main(String[] args) {
        약수의개수와덧셈 a = new 약수의개수와덧셈();
        System.out.println(a.solution(13,17));
    }
}
