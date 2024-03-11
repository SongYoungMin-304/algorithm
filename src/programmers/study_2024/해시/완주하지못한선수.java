package programmers.study_2024.해시;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> partHashMap = new HashMap<String, Integer>();
//        HashMap<String, Integer> compHashMap = new HashMap<String, Integer>();

        Arrays.asList(participant).stream().forEach(p -> {
            if(partHashMap.containsKey(p)){
                partHashMap.put(p, partHashMap.get(p) + 1);
            }else {
                partHashMap.put(p, 1);
            }
        });

        Arrays.asList(completion).stream().forEach(c -> {
            partHashMap.put(c, partHashMap.get(c) -1 );
        });

        for(String key : partHashMap.keySet()){
            if(partHashMap.get(key) == 1){
                answer = key;
                break;
            }
        }

        return answer;
    }

}
