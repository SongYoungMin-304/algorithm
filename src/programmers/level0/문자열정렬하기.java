package programmers.level0;

import java.util.Arrays;

public class 문자열정렬하기 {

    public String solution(String my_string) {
        String answer = "";

        my_string = my_string.toLowerCase();

        char[] list = new char[my_string.length()];

        for(int a = 0; a < my_string.length(); a++){
            list[a] = my_string.charAt(a);
        }

        Arrays.sort(list);

        return new String(list);
    }

    public static void main(String[] args) {

        문자열정렬하기 a = new 문자열정렬하기();

        System.out.println(a.solution("Bcad"));
    }
}
