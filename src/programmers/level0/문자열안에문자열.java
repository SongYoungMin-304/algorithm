package programmers.level0;

public class 문자열안에문자열 {

    public int solution(String str1, String str2) {
        int answer = 2;

        if(str1.contains(str2)){
            answer = 1;
        }

        return answer;
    }

}
