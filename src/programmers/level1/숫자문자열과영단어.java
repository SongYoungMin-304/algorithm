package programmers.level1;

public class 숫자문자열과영단어 {

    public int solution(String s) {

        int answer = 0;

        String []arr = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};

        for(int a = 0; a < arr.length; a++){
            s= s.replace(arr[a],String.valueOf(a));
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        숫자문자열과영단어 a = new 숫자문자열과영단어();

        System.out.println(a.solution("one4seveneight"));
    }
}
