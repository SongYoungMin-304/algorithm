package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<Character, Integer> map = new HashMap();

        // STEP 1 MAP 에다가 담자
        for(int a = 0; a < survey.length; a++){

            int value = choices[a];

            if(value > 0 && value < 4){
                map.put(survey[a].charAt(0), map.getOrDefault(survey[a].charAt(0),0) + 4-value);
            }else if(value > 4){
                map.put(survey[a].charAt(1), map.getOrDefault(survey[a].charAt(0),0) + value-4);
            }

        }

        // STEP 2 정의를 하고... 순서대로 뽑자...

        return new StringBuilder()
                .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
                .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
                .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
                .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
                .toString();
    }



    // "AN CF MJ RT NA" //

    //  AN 5  N 1점
    //  CF 3  C 1점
    //  MJ 2  M 2점
    //  RT 7  T 3점
    //  NA 5  A 1점

    // N 1점
    // C 1점
    // M 2점
    // T 3점

    // 1 2 3 4 5 6 7
    // 3 2 1 0 1 2 3

    public static void main(String[] args) {

        성격유형검사하기  a = new 성격유형검사하기();

        String []survey = {"AN","CF","MJ","RT","NA"};

        int []choices = {5,3,2,7,5};

        System.out.println(a.solution(survey, choices));

    }
}
