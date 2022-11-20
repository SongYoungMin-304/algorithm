package programmers.level0;

public class 문자열밀기 {

    public int solution(String A, String B) {
        int answer = -1;

        if(A.equals(B)){
            return 1;
        }

        for(int c =  0; c < A.length(); c++) {
            String tmp = A.substring(A.length() - 1, A.length());
            String remain = A.substring(0, A.length() - 1);

            A = tmp + remain;

            if(A.equals(B)){
                return 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        문자열밀기 a = new 문자열밀기();

        System.out.println(a.solution("hello","ohell"));
    }
}
