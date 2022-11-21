package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 과일장수 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        int cnt = 0;

        for(int a = score.length - 1; a >= 0; a--){
            ++cnt;
            if(cnt%m==0){
                answer+=score[a]*m;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};

        과일장수 a = new 과일장수();

        a.solution(0,0, arr);
    }
}
